package surnoi.login.EmployeeLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import surnoi.login.EmployeeLogin.data.LeaveAction;

public interface LeaveActionRepo extends JpaRepository<LeaveAction, Long> {
}
