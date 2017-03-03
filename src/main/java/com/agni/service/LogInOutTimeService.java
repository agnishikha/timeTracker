package com.agni.service;

import com.agni.model.EmployeeLogInDetailDTO;
import org.springframework.stereotype.Service;

/**
 * Created by xprk459 on 2/27/2017.
 */

public interface LogInOutTimeService {

    public void logInTime(EmployeeLogInDetailDTO employeeLogInDetail);

    public void logOutTime(EmployeeLogInDetailDTO employeeLogInDetail);

}
