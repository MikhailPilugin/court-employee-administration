package ru.iterion.courtemployeeadministration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.iterion.courtemployeeadministration.model.Court;

public interface CourtRepository extends JpaRepository<Court, Integer> {
}
