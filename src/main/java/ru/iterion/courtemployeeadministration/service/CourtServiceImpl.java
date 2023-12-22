package ru.iterion.courtemployeeadministration.service;

import org.springframework.stereotype.Service;
import ru.iterion.courtemployeeadministration.repository.CourtRepository;
import ru.iterion.courtemployeeadministration.repository.EmployeeRepository;

import java.util.List;

@Service
public class CourtServiceImpl implements CourtService {

    private final CourtRepository courtRepository;
    private final EmployeeRepository employeeRepository;

    public CourtServiceImpl(CourtRepository courtRepository, EmployeeRepository employeeRepository) {
        this.courtRepository = courtRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List get() {
        return courtRepository.findAll();
    }

    @Override
    public List getEmployees(Integer id) {
        return employeeRepository.findByCourtId(id);
    }
}
