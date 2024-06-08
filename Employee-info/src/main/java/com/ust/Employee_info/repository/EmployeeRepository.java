package com.ust.Employee_info.repository;

import com.ust.Employee_info.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByGrade(String grade);

    List<Employee> findBySalaryBetween(Double minSalary, Double maxSalary);
}

