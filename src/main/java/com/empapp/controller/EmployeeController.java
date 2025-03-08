package com.empapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    //http://localhost:8080/viewAddEmployee
    @RequestMapping("/viewAddEmployee")
    public String viewAddEmployeePage(){
             return "add_employee";
    }
}
