package com.xml_project;

import com.xml_project.xml_file.Reader;
import com.xml_project.xml_file.ReaderImpl;
import com.xml_project.xml_file.Writer;
import com.xml_project.xml_file.WriterImpl;
import com.xml_project.model.SimpleBean;

public class Main {
    public static final String PATH = "src/main/resources/simpleBean.xml";

    public static void main(String[] args) {
        Writer writer = new WriterImpl(PATH);
        Reader reader = new ReaderImpl();
        SimpleBean simpleBean = new SimpleBean(5, 3);

        writer.write(simpleBean);
        SimpleBean simpleBean1 = reader.reader(PATH);
        System.out.println( simpleBean1);
    }
}
