package com.agni.controller;

import com.agni.domain.Roles;
import com.agni.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agnis on 19-03-2017.
 */
@RestController
public class RolesController {

    @Autowired
    RoleService roleService;
    @RequestMapping(value="/addRole",method= RequestMethod.POST)
    public void addRole(@RequestBody Roles role){
        roleService.addRoles(role);
    }


}
