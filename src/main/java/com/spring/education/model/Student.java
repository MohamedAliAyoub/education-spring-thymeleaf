package com.spring.education.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.crypto.Data;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Entity
@Table(name = "student")
public class Student  extends Person{

    @OneToOne
    private User user;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
