package com.example.demo.controller;

import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @GetMapping
    public Employee getEmployee(){
        Employee emp= new Employee();
        emp.setName("dilini");
        emp.setId(2032);
        return emp;



    }


}
