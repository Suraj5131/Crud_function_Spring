package com.example.Sprint_Boot_Crud;

import com.example.Sprint_Boot_Crud.model.Employee;
import com.example.Sprint_Boot_Crud.repository.Employee_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprintBootCrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootCrudApplication.class, args);
	}
@Autowired
private Employee_repo employeeRepo;
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee();
		employee.setF_name("Ramesh");
		employee.setL_name("Kadam");
		employee.setEmail("abc@gmail.com");
		employeeRepo.save(employee);

		Employee employee1=new Employee();
		employee1.setF_name("Suresh");
		employee1.setL_name("Choudhary");
		employee1.setEmail("djugjusg@gmail.com");
		employeeRepo.save(employee1);

	}
}
