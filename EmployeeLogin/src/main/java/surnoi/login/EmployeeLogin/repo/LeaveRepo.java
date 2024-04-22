package surnoi.login.EmployeeLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import surnoi.login.EmployeeLogin.data.RequestLeave;

public interface LeaveRepo extends JpaRepository<RequestLeave, Long> {

}
