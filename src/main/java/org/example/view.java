package org.example;

import java.util.List;

public interface view <T extends Teacher>{
    public void sendOnConsole(List<T> teacher);
}
