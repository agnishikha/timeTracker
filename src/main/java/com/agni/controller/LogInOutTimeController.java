package com.agni.controller;

import com.agni.domain.TimeTrack;
import com.agni.model.EmployeeLogInDetailDTO;
import com.agni.service.LogInOutTimeService;
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
    public void logInTime(@RequestBody TimeTrack timeTrack){

        logInOutTimeService.logInTime(timeTrack);
    }

    @RequestMapping(value="/logOutTime",method= RequestMethod.POST)
    public void logOutTime(@RequestBody EmployeeLogInDetailDTO employeeLogInDetail){
        logInOutTimeService.logOutTime(employeeLogInDetail);
    }

    public void setLogInOutTimeService(LogInOutTimeService logInOutTimeService) {
        this.logInOutTimeService = logInOutTimeService;
    }
}
