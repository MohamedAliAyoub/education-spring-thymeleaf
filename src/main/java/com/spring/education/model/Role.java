package com.spring.education.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;

import java.util.List;
@Entity(name = "role")

public class Role extends BaseEntity {

    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<User> users;

}
