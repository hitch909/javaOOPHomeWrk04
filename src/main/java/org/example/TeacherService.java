package org.example;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@ToString
public class TeacherService implements service<Teacher>{
    private List<Teacher> teacherList;
    public TeacherService(){
        this.teacherList = new ArrayList<>();
    }
    @Override
    public List<Teacher> getAll() {
        return teacherList;
    }
    @Override
    public void criete(String name, Integer age, Integer workExperience) {
        Teacher teacher = new Teacher(name,age, workExperience);
        teacherList.add(teacher);
    }
}
