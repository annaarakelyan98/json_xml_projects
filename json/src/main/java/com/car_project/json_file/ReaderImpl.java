package com.car_project.json_file;

import com.car_project.model.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReaderImpl implements Reader {
    public static final String PATH = "src/main/resources/car.json";

    @Override
    public Car reader(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Car car = objectMapper.readValue(new File(path), Car.class);

            return car;

        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        return new Car();
    }
}
