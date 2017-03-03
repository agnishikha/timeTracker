package com.agni.model;

import java.util.Date;

/**
 * Created by xprk459 on 2/27/2017.
 */


public class EmployeeLogInDetailDTO {

    private int employeeID;

    private Date logInDateTime;

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public Date getLogInDateTime() {    return logInDateTime;  }

    public void setLogInDateTime(Date logInDateTime) {
        this.logInDateTime = logInDateTime;
    }
}
