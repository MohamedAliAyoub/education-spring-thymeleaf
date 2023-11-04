package com.spring.education.model;

import com.spring.education.model.enums.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@MappedSuperclass
public class Person extends Boy {

    @Column(name = "age")
    private String age;
    @Column(name = "address")

    private String address;
    @Column(name = "date")

    private Data date;

    @Column(name = "gender")

    private Gender gender;

    @Column(name = "date_created")

    private Data dateCreated;

    @Column(name = "last_updated")

    private Data lastUpdated;


}
