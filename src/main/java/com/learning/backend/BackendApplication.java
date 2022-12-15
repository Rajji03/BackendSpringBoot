package com.learning.backend;

import com.learning.backend.repository.AssetsRepository;
import com.learning.backend.repository.EmployeeRepository;
import com.learning.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

	@Autowired
	AssetsRepository assetsRepository;
	@Autowired
	EmployeeRepository employeeRepository;
	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		userService.createEmployeeAssets();
		userService.createEmployeeAssetsButSaveOnlyAssets();
	}
}
