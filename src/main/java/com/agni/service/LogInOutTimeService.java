package com.agni.service;

import com.agni.domain.TimeTrack;
import com.agni.model.EmployeeLogInDetailDTO;

/**
 * Created by xprk459 on 2/27/2017.
 */

public interface LogInOutTimeService {

    public void logInTime(TimeTrack timeTrack);

    public void logOutTime(EmployeeLogInDetailDTO employeeLogInDetail);

}
