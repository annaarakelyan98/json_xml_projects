package com.xml_project.xml_file;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.xml_project.model.SimpleBean;

import java.io.File;
import java.io.IOException;

public class ReaderImpl implements Reader {
    @Override
    public SimpleBean reader(String path) {
        XmlMapper xmlMapper = new XmlMapper();

        try {
            SimpleBean simpleBean = xmlMapper.readValue(new File(path), SimpleBean.class);
            return simpleBean;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new SimpleBean();
    }
}
