package com.tematihonov;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        LinkedList<Cat> catLinkedList = new LinkedList<>();
        catLinkedList.addAll(0, catsCollection);
        catLinkedList.add(0, new Cat("Чижик", 3));
        catLinkedList.addFirst(new Cat("Котик", 2));
        catLinkedList.addLast(new Cat("Котик", 2));
        catLinkedList.remove(0);
        catLinkedList.set(0, cats[0]);
        System.out.println(catLinkedList.contains(cats[1]));
        cats[1] = catLinkedList.get(0);
        cats[1].info();
        for (Cat number : catLinkedList) {
            number.info();
        }
    }
}
