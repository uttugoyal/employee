package com.demo.md.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.md.model.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}