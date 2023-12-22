package ru.iterion.courtemployeeadministration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iterion.courtemployeeadministration.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
