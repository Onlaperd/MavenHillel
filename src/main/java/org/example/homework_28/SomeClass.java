package org.example.homework_28;

import java.io.Serializable;

public class SomeClass implements Serializable {

    private final String name;

    public SomeClass(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "name='" + name + '\'' +
                '}';
    }
}
