package surnoi.login.EmployeeLogin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import surnoi.login.EmployeeLogin.data.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee ,Long> {
    @Query("delete from Employee e where e.id = ?1")
    static void deleteEmployeeById(Long id) {

    }
    Optional<Employee> findByEmployeeUsernameAndEmployeePassword(String employeeUsername, String employeePassword);
    Optional<Employee> findEmployeeById(Long id);
}

