package com.agni.service.impl;

import com.agni.domain.TimeTrack;
import com.agni.model.EmployeeLogInDetailDTO;
import com.agni.repository.EmployeeRepository;
import com.agni.repository.RolesRepository;
import com.agni.repository.TimeTrackRepository;
import com.agni.service.LogInOutTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xprk459 on 2/27/2017.
 */
@Service
public class LogInOutServiceImpl implements LogInOutTimeService {

    @Autowired
    TimeTrackRepository timeTrackRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    RolesRepository rolesRepository;

    @Override
    public void logInTime(TimeTrack timeTrack) {
        timeTrack.setEmployee(employeeRepository.findOne(timeTrack.getEmpId()));
      //  timeTrack.getEmployee().setRoles();
        timeTrackRepository.save(timeTrack);
    }

    @Override
    public void logOutTime(EmployeeLogInDetailDTO employeeLogInDetail) {
      //  timeTrackRepository.save(timeTrack);

    }
}
