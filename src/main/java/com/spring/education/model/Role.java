package com.spring.education.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "role")

public class Role extends BaseEntity {

    private String roleName;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<User> users;

}
