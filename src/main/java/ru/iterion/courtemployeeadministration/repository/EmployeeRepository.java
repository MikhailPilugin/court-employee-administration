package ru.iterion.courtemployeeadministration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.iterion.courtemployeeadministration.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(nativeQuery = true, value = "select * from t_employee as em " +
            "join t_court as ct on em.court_id = ct.id " +
            "where ct.id = :id")
    List<Employee> findByCourtId(Integer id);
}
