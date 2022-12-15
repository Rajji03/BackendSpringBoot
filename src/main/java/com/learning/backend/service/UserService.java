package com.learning.backend.service;

import com.learning.backend.entity.Assets;
import com.learning.backend.entity.Employee;
import com.learning.backend.repository.AssetsRepository;
import com.learning.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    AssetsRepository assetsRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    public void createEmployeeAssets(){
        Employee employee= new Employee();
        employee.setAge(23);
        employee.setCity("noida");
        employee.setDepartment("it");
        employee.setFirstName("john");
        employee.setSecondName("cena");
        employeeRepository.save(employee);
        Assets assets = new Assets();
        assets.setEmployee(employee);
        assets.setChargerId("12efj");
        assets.setLaptopId("djlfjds1");
        assets.setLaptopName("lenovo");
        assetsRepository.save(assets);
    }
    public void createEmployeeAssetsButSaveOnlyAssets(){
        Employee employee= new Employee();
        employee.setAge(23);
        employee.setCity("noidaaa");
        employee.setDepartment("it");
        employee.setFirstName("john");
        employee.setSecondName("cena");
//        employeeRepository.save(employee);
        Assets assets = new Assets();
        assets.setEmployee(employee);
        assets.setChargerId("12efjaa");
        assets.setLaptopId("djlfjds1");
        assets.setLaptopName("lenovo");
        assetsRepository.save(assets);
    }
}
