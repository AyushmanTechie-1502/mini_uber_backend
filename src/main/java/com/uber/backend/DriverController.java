package com.uber.backend;

import com.uber.backend.entity.Driver;
import com.uber.backend.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drivers") // All URLs in this file will start with /drivers
public class DriverController {

    @Autowired
    private DriverService driverService;

    // 1. Endpoint to register a new driver
    // URL: POST http://localhost:8080/drivers
    @PostMapping
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.registerDriver(driver);
    }

    // 2. Endpoint to get all drivers
    // URL: GET http://localhost:8080/drivers
    @GetMapping
    public List<Driver> getAllDrivers() {
        return driverService.getAllDrivers();
    }
}