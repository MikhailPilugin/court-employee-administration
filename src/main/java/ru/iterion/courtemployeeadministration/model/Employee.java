package ru.iterion.courtemployeeadministration.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "t_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "court_id")
    private Court court;

    @Size(min = 3, message = "Не меньше 3 знаков")
    private String firstName;

    @Size(min = 3, message = "Не меньше 3 знаков")
    private String lastName;

    @Size(min = 3, message = "Не меньше 3 знаков")
    private String middleName;
    private String address;

    @OneToOne
    @JoinColumn(name = "position_id")
    private Position position;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
