package com.spring.education.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

import javax.xml.crypto.Data;

public class Master extends Person {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    private Course course;


}
