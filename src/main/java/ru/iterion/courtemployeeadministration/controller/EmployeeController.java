package ru.iterion.courtemployeeadministration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import ru.iterion.courtemployeeadministration.model.Employee;
import ru.iterion.courtemployeeadministration.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);
    private final EmployeeServiceImpl employeeService;

    public EmployeeController(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public Employee create(@RequestBody Employee employee) {
        log.info("POST request of method create /employee");
        return employeeService.create(employee);
    }

    @GetMapping
    public Employee get(@RequestParam Integer id) {
        log.info("GET request of method get /employee");
        return employeeService.get(id);
    }

    @PatchMapping
    public Employee update(@RequestBody Employee employee) {
        log.info("PATCH request of method update /employee");
        return employeeService.update(employee);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id) {
        log.info("DELETE request of method delete /employee");
        employeeService.delete(id);
    }
}
