package com.spring.education.model;

import jakarta.persistence.*;

import java.util.List;

public class User extends BaseEntity {

    private String username;
    private String password;

    @ManyToMany(mappedBy = "roles")
    @JoinTable(
            name = "user_roles",
            joinColumns = {
                    @JoinColumn(name = "user_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id")
            }
    )
    private List<Role> roles;
    private Student student;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "user")
    private Admin admin;
    private Master master;
}
