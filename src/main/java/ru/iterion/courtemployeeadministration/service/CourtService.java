package ru.iterion.courtemployeeadministration.service;

import java.util.List;

public interface CourtService {
    List get();

    List getEmployees(Integer id);
}
