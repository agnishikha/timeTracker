package com.agni.controller;

import com.agni.domain.Employee;
import com.agni.model.EmployeeLogInDetailDTO;
import com.agni.service.RegisterEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xprk459 on 3/1/2017.
 */
@RestController
public class RegisterEmployeeController {
    @Autowired
    RegisterEmployeeService registerEmployeeService;

    @RequestMapping(value="/registerEmployee",method= RequestMethod.POST)
    public void registerEmployee(@RequestBody Employee employee){
        registerEmployeeService.registerEmployee(employee);
    }
}
