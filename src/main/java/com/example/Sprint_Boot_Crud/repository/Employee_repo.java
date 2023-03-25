package com.example.Sprint_Boot_Crud.repository;

import com.example.Sprint_Boot_Crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Employee_repo extends JpaRepository<Employee,Long> {

}
