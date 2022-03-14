package com.rvmagrini.springjpa.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CONFERENCE_USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long conferenceUserId;

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;

    @Min(18)
    private int age;

}
