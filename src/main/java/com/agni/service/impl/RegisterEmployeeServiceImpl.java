package com.agni.service.impl;

import com.agni.domain.Employee;
import com.agni.repository.EmployeeRepository;
import com.agni.service.RegisterEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xprk459 on 3/1/2017.
 */
@Service
public class RegisterEmployeeServiceImpl implements RegisterEmployeeService {

    @Autowired
    EmployeeRepository registerEmployeeRepository;

    @Override
    public void registerEmployee(Employee employee) {
        Employee employee1 = registerEmployeeRepository.save(employee);

    }
}
