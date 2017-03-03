package com.agni.domain;

import javax.persistence.*;

/**
 * Created by xprk459 on 2/28/2017.
 */
public class EmployeeRoleMapping {
    @Id //signifies the primary key
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    @ManyToMany
    @JoinColumn(referencedColumnName="id")
    private Employee employee;

    @ManyToMany
    @JoinColumn(referencedColumnName="id")
    private Roles role;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }


    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }





}
