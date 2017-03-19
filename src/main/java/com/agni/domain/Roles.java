package com.agni.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by xprk459 on 2/28/2017.
 */
@Entity
public class Roles implements Serializable{
    @Id //signifies the primary key
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private String role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
