package com.uber.backend.service;

import com.uber.backend.entity.Driver;
import com.uber.backend.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    // 1. Core Logic to register a brand new driver
    public Driver registerDriver(Driver driver) {
        // Business Rule: Every new driver starts as AVAILABLE
        driver.setStatus("AVAILABLE");

        // Save the verified driver into the database using our repo bridge
        return driverRepository.save(driver);
    }

    // 2. Core Logic to retrieve all drivers currently in the system
    public List<Driver> getAllDrivers() {
        return driverRepository.findAll();
    }
}