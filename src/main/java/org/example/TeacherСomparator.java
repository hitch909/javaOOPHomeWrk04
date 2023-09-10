package org.example;

import java.util.Comparator;

public class TeacherСomparator<T extends Teacher> implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o2.getAge()- o1.getAge();
    }
}
