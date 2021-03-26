package com.tematihonov;


import java.util.LinkedList;

public class StackList {
    private Link.LinkedList list;

    public StackList () {
        list = new Link.LinkedList();
    }

    public void push (String name, int age) {
        list.insert (name, age);
    }

    public String pop () {
        return list.delete().name;
    }

    public boolean isEmpty () {
        return list.isEmpty();
    }

    public void display () {
        list.display();
    }
}
