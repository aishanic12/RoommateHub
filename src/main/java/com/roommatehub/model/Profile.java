package com.roommatehub.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "profile")  // optional but safer
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String budget;
    private String sleepSchedule;
    private String cleanliness;
    private String studyHabits;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
}
