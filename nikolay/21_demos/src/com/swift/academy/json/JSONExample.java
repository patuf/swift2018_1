package com.swift.academy.json;

import java.io.Writer;
import java.io.FileWriter;
import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JSONExample {

    public static void main(String[] args) throws IOException {

        LocalDateTime[] dates = new LocalDateTime[] {
            LocalDateTime.now().minusYears(4),
            LocalDateTime.now().minusMonths(27)
        };

        Vehicle vehicle = new Vehicle("Mercedes", 190, 12.5, new Engine(315.3), dates);

//        Gson gson = new Gson();
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(vehicle);
        System.out.println(json);

        String fileName = "vehicle.json";

        try (Writer fw = new FileWriter(fileName)) {
            fw.write(json);
        }

        Vehicle veh2 = gson.fromJson(json, Vehicle.class);
        System.out.println("Deserialized from the JSON:");
        System.out.println(veh2.engine.maxTorque);
    }
}
