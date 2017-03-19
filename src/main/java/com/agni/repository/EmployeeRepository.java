package com.agni.repository;

import com.agni.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by xprk459 on 3/1/2017.
 */
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {



}
