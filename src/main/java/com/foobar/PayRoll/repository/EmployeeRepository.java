package com.foobar.PayRoll.repository;

import com.foobar.PayRoll.entities.Employee;
import com.foobar.PayRoll.entities.PayRates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select new Employee(e.idEmployee,e.vacationDays)  from Employee e where e.vacationDays >20")
    List<Employee> getAccumulatedDay();

}
