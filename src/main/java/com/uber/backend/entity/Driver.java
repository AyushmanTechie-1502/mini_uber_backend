package com.uber.backend.entity;

import jakarta.persistence.*;

import java.util.Objects;
@Entity
@Table(name="drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true, nullable = false)
    private String carNumber;
    private String status;
    public Driver(){

    }

    public Driver(String name,String carNumber,String status){
        this.name=name;
        this.carNumber=carNumber;
        this.status=status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(id, driver.id) &&
                Objects.equals(name, driver.name) &&
                Objects.equals(carNumber, driver.carNumber) &&
                Objects.equals(status, driver.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, carNumber, status);
    }
}
