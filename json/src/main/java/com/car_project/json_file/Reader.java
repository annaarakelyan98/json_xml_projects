package com.car_project.json_file;

import com.car_project.model.Car;

import java.io.IOException;

public interface Reader {
    Car reader(String path);
}
