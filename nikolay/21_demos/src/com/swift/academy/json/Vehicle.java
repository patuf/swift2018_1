package com.swift.academy.json;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vehicle {
    String model;
    int horsePower;
    double fuelConsumption;
    Engine engine;
    LocalDateTime[] maintenanceDates;

    public Vehicle(String model,
                   int horsePower,
                   double fuelConsumption,
                   Engine engine,
                   LocalDateTime[] maintenanceDates) {

        this.model = model;
        this.horsePower = horsePower;
        this.fuelConsumption = fuelConsumption;
        this.engine = engine;
        this.maintenanceDates = maintenanceDates;
    }
}
