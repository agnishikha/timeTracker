package com.agni.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by xprk459 on 2/27/2017.
 */
@Entity
public class TimeTrack {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    private Date logIntime;

    private Date logOuttime;



    @ManyToOne(optional=false)
    @JoinColumn(name="EMP_ID",referencedColumnName="id")
    private Employee employee;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLogIntime() {
        return logIntime;
    }

    public void setLogIntime(Date logIntime) {
        this.logIntime = logIntime;
    }

    public Date getLogOuttime() {
        return logOuttime;
    }

    public void setLogOuttime(Date logOuttime) {
        this.logOuttime = logOuttime;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
