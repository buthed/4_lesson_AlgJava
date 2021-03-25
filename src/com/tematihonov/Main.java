package com.tematihonov;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Cat> catLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            catLinkedList.add(new Cat("Cat"+i, random.nextInt(8)));
        }
        System.out.println("Task 4.1");
        Stack<Cat> catObj = new Stack<>();
        System.out.println(catLinkedList.get(2).print());
        catObj.push(new Cat("Боря", 2));
        catObj.push(new Cat("Вася", 6));
        catObj.push(new Cat("Сеня", 1));
        catObj.push(new Cat("Игорь", 5));
        catObj.pop().print();
    }
}
