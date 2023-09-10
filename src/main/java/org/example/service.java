package org.example;

import java.util.List;

public interface service <T>{
    List<Teacher> getAll();

    //List<T>getAll;
    void criete(String name, Integer age, Integer workExperience);
}
