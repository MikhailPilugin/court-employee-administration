package ru.iterion.courtemployeeadministration.service;

import ru.iterion.courtemployeeadministration.model.Employee;

public interface EmployeeService {
    Employee create(Employee employee);

    Employee get(Integer id);

    Employee update(Employee employee);

    void delete(Integer id);
}
