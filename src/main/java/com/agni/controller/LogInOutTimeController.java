package com.agni.controller;

import com.agni.model.EmployeeLogInDetailDTO;
import com.agni.service.LogInOutTimeService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xprk459 on 2/27/2017.
 */
@RestController
public class LogInOutTimeController {

    @Autowired
    private LogInOutTimeService logInOutTimeService;

    @RequestMapping(value="/logInTime",method= RequestMethod.POST)
    public void logInTime(@RequestBody EmployeeLogInDetailDTO employeeLogInDetail){
        logInOutTimeService.logInTime(employeeLogInDetail);
    }

    @RequestMapping(value="/logOutTime",method= RequestMethod.POST)
    public void logOutTime(@RequestBody EmployeeLogInDetailDTO employeeLogInDetail){
        logInOutTimeService.logOutTime(employeeLogInDetail);
    }

    public void setLogInOutTimeService(LogInOutTimeService logInOutTimeService) {
        this.logInOutTimeService = logInOutTimeService;
    }
}
