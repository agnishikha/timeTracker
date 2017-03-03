package com.agni.service.impl;

import com.agni.model.EmployeeLogInDetailDTO;
import com.agni.service.LogInOutTimeService;
import org.springframework.stereotype.Service;

/**
 * Created by xprk459 on 2/27/2017.
 */
@Service
public class LogInOutServiceImpl implements LogInOutTimeService {
    @Override
    public void logInTime(EmployeeLogInDetailDTO employeeLogInDetail) {
        System.out.print("logging in");
    }

    @Override
    public void logOutTime(EmployeeLogInDetailDTO employeeLogInDetail) {
        System.out.print("logging out");

    }
}
