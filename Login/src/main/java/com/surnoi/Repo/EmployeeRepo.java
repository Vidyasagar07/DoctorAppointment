package com.surnoi.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surnoi.Entity.EmployeeLogin;

public interface EmployeeRepo extends JpaRepository<EmployeeLogin, Long> {

}
