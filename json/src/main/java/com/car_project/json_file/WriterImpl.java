package com.car_project.json_file;

import com.car_project.model.Car;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class WriterImpl implements Writer {
    private String path;

    public WriterImpl(String path) {
        this.path = path;
    }

    @Override
    public void write(Car car) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(new File(path), car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
