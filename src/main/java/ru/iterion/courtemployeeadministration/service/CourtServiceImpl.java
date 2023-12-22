package ru.iterion.courtemployeeadministration.service;

import org.springframework.stereotype.Service;
import ru.iterion.courtemployeeadministration.repository.CourtRepository;

import java.util.List;

@Service
public class CourtServiceImpl implements CourtService {

    private final CourtRepository courtRepository;

    public CourtServiceImpl(CourtRepository courtRepository) {
        this.courtRepository = courtRepository;
    }

    @Override
    public List get() {
        return courtRepository.findAll();
    }
}
