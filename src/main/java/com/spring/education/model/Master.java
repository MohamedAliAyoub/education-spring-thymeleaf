package com.spring.education.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Master extends Person {

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne
    private Course course;


}
