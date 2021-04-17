package com.xml_project.xml_file;

import com.xml_project.model.SimpleBean;

public interface Reader {
    SimpleBean reader(String path);
}
