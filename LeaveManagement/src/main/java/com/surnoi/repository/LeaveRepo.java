package com.surnoi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.surnoi.model.RequestLeave;

public interface LeaveRepo extends JpaRepository<RequestLeave, Long> {

}
