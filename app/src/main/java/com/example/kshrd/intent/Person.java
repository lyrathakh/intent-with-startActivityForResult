package com.example.kshrd.intent;

/**
 * Created by kshrd on 5/18/17.
 */

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person( int age,String name) {
        this.name = name;
        this.age = age;
    }
}
