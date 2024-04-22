package com.surnoi.Login.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surnoi.Login.Entity.LoginEmployee;

public interface LoginRepo extends JpaRepository<LoginEmployee, Long>{

}
