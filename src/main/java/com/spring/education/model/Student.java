package com.spring.education.model;

import jakarta.persistence.OneToOne;

import javax.xml.crypto.Data;

public class Student  extends Person{

    @OneToOne
    private User user;
}
