package com.agni.service.impl;

import com.agni.domain.Roles;
import com.agni.repository.RolesRepository;
import com.agni.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by agnis on 19-03-2017.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RolesRepository rolesRepository;

    @Override
    public void addRoles(Roles role) {
        rolesRepository.save(role);
    }

    @Override
    public void getAllRoles() {
        rolesRepository.findAll();
    }
}
