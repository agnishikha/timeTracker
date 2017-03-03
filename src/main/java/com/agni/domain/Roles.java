package com.agni.domain;

import javax.persistence.*;

/**
 * Created by xprk459 on 2/28/2017.
 */
@Entity
public class Roles {
    @Id //signifies the primary key
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String role;

}
