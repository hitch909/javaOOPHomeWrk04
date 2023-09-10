package org.example;

import java.util.List;

public class TeatcherView <T extends Teacher> implements view<T>{
    @Override
    public void sendOnConsole(List<T> teacher) {
        for (T user: teacher){
            System.out.println(user);
        }
    }
}
