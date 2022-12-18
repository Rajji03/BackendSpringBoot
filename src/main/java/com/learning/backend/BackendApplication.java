package com.learning.backend;

import com.learning.backend.entity.Assets;
import com.learning.backend.entity.Employee;
import com.learning.backend.repository.AssetsRepository;
import com.learning.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {



	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	AssetsRepository assetsRepository;
	@Override
	public void run(String... args) throws Exception {
//		Employee employee= new Employee();
//		employee.setEmail("anyemail@gmail.com");
//		employee.setCity("new york");
//		employee.setFirstName("john");
//		employee.setSecondName("wick");
//		employee.setAge(26);
//		employee.setDepartment("it");
//		employeeRepository.save(employee);
//
//		Assets assets= new Assets();
//		assets.setLaptopName("lenove 121");
//		assets.setLaptopId("123ACS1");
//		assets.setChargerId("909ds0");
//		assetsRepository.save(assets);
	}
}
