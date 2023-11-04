package com.spring.education.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity(name = "admin")
public class Admin extends Boy{

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

//    private List<Course> courses;
}
