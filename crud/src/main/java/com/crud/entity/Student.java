package com.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stdId;

    @Column(name = "std_name")
    private String stdName;

    @Column(name = "std_roll_no")
    private String stdRollNo;



}
