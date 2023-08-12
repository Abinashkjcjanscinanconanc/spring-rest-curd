package org.jt.springrest.repository;

import org.jt.springrest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    //all crud database method
}
