package com.xml_project.xml_file;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xml_project.model.SimpleBean;

import java.io.File;
import java.io.IOException;

public class WriterImpl implements Writer {
    private String path;

    public WriterImpl(String path) {
        this.path = path;
    }

    @Override
    public void write(SimpleBean simpleBean) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            xmlMapper.writeValue(new File(path), simpleBean);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
