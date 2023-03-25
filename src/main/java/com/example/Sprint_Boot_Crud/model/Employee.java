package com.example.Sprint_Boot_Crud.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private long id ;
    @Column(name = "First_Name")

    private String f_name;
    @Column(name = "Last_Name")
    private String l_name;
    @Column(name = "Email")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //column annotation
    private  String email;
}
