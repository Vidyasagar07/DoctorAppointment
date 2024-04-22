package com.surnoi.StudentProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.surnoi.StudentProject.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long> {
	

}
