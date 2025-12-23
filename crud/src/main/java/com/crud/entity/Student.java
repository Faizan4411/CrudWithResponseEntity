package com.crud.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

<<<<<<< HEAD
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
=======

@Getter
@Setter
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="std_id")
    private Long stdId;

    @Column(name="std_name")
    private String stdName;

    @Column(name="std_roll_no")
>>>>>>> 3450800 (Added crud folder with all files)
    private String stdRollNo;



<<<<<<< HEAD
=======


>>>>>>> 3450800 (Added crud folder with all files)
}
