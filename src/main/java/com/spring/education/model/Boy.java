package com.spring.education.model;

import jakarta.persistence.Column;

public class Boy extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone")
    private String phone;
}
