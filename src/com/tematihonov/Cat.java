package com.tematihonov;

public class Cat {
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String print() {
        return this.name + " имеет возраст " + this.age;
    }
}
