package ru.iterion.courtemployeeadministration.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.iterion.courtemployeeadministration.service.CourtServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/court")
public class CourtController {
    private static final Logger log = LoggerFactory.getLogger(CourtController.class);

    @Autowired
    private final CourtServiceImpl courtService;

    public CourtController(CourtServiceImpl courtService) {
        this.courtService = courtService;
    }

    @GetMapping
    public List get(Model model) {
        log.info("GET request of method get /court");
        return courtService.get();
    }

    @GetMapping("/employees/{id}")
    public List getEmployees(@PathVariable String id) {
        log.info("GET request of method getEmployee /employees");
        return courtService.getEmployees(Integer.valueOf(id));
    }
}
