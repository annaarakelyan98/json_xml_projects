package com.car_project;

import com.car_project.json_file.Reader;
import com.car_project.json_file.ReaderImpl;
import com.car_project.json_file.Writer;
import com.car_project.json_file.WriterImpl;
import com.car_project.model.Car;

import java.io.IOException;

public class Main {
    public static final String PATH = "src/main/resources/car.json";

    public static void main(String[] args) {
        Writer writer = new WriterImpl(PATH);
        Reader reader = new ReaderImpl();
        Car car = new Car("yellow", "renault");

            writer.write(car);
            Car car1 = reader.reader(PATH);

            System.out.println(car1);

    }
}
