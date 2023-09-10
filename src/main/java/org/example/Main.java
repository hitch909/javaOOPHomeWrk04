package org.example;

/*
— Создать класс УчительКомпаратор по некоторому чиссловому параметру, типизировать его.
— Создать класс УчительСервис и реализовать аналогично проделанному на семинаре для Студента,
 и реализовать возможность создания, редактирования конкретного учителя и отображения списка учителей, имеющихся в системе.
— Создать класс УчительВью и реализовать аналогично проделанному на семинаре для Студентов;
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Петров", 48, 25);
        Teacher teacher2 = new Teacher("Иванов", 30, 15);
        Teacher teacher3 = new Teacher("Сидоров", 40, 20);
        Teacher teacher4 = new Teacher("Васильев", 55, 35);
        Teacher teacher5 = new Teacher("Егоров", 37, 17);

        ArrayList<Teacher> teacherArrayList = new ArrayList<>();
        teacherArrayList.add(teacher1);
        teacherArrayList.add(teacher2);
        teacherArrayList.add(teacher3);
        teacherArrayList.add(teacher4);
        teacherArrayList.add(teacher5);

        TeacherService teacherService = new TeacherService();
        teacherService.criete("Иванов", 64, 34);
        teacherService.criete("Григорьев", 55, 25);
        teacherService.criete("Федоров", 43, 15);
        teacherService.criete("Смирнов", 40, 23);

        System.out.println(teacherArrayList);
        teacherArrayList.sort(new TeacherСomparator<>());
        System.out.println(teacherArrayList);

        System.out.println("________________________________________________");
        System.out.println(teacherService);
        //teacherService.getAll();

        TeatcherView teatcherView = new TeatcherView();
        teatcherView.sendOnConsole(teacherArrayList);

    }
}