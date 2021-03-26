package com.tematihonov;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        long startTime;
        long endTime;
        Random random = new Random();
        LinkedList<Cat> catLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            catLinkedList.add(new Cat("Cat"+i, random.nextInt(8)));
        }
        System.out.println("Task 4.1 - Работа со стеком");
        Stack<Cat> catObj = new Stack<>();
        catObj.push(new Cat("Боря", 2));
        catObj.push(new Cat("Вася", 6));
        catObj.push(new Cat("Сеня", 1));

        startTime = System.nanoTime();
        catObj.push(new Cat("Игорь", 5));
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода push в стеке: " + endTime);

        startTime = System.nanoTime();
        catObj.pop();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода pop в стеке: " + endTime);

        startTime = System.nanoTime();
        catObj.peek();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода peek в стеке: " + endTime);
        System.out.println();


        System.out.println("Task 4.2 - Работа с очередью");
        Queue<Cat> catQueue = new LinkedList<>();

        startTime = System.nanoTime();
        catQueue.add(new Cat("Игорь", 5));
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода add в очереди: " + endTime);

        startTime = System.nanoTime();
        catQueue.element();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода element в стеке: " + endTime);

        startTime = System.nanoTime();
        catQueue.remove();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода remove в стеке: " + endTime);
        System.out.println();


        System.out.println("Task 4.3 - Работа с дек");
        Deque<Cat> deqCat = new ArrayDeque<>();

        startTime = System.nanoTime();
        deqCat.add(new Cat("Игорь", 5));
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода add в deq: " + endTime);

        startTime = System.nanoTime();
        deqCat.addFirst(new Cat("Игорь", 5));
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода addFirst в deq: " + endTime);

        startTime = System.nanoTime();
        deqCat.addLast(new Cat("Игорь", 5));
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода addLast в deq: " + endTime);

        startTime = System.nanoTime();
        deqCat.pollFirst();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода pollFirst в deq: " + endTime);

        startTime = System.nanoTime();
        deqCat.pollLast();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода pollLast в deq: " + endTime);

        startTime = System.nanoTime();
        deqCat.peekFirst();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода peekFirst в dec: " + endTime);

        startTime = System.nanoTime();
        deqCat.peekLast();
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода peekLast в dec: " + endTime);


        System.out.println("Task 4.4 - Работа с приоритетной очередью");
        PriorityQueue<Integer> prior = new PriorityQueue<>();
        prior.add(9);
        startTime = System.nanoTime();
        prior.add(3);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода add в приоритетной очереди: " + endTime);

        startTime = System.nanoTime();
        prior.offer(5);
        endTime = System.nanoTime() - startTime;
        System.out.println("Время выполнения метода offer в приоритетной очереди: " + endTime);


        System.out.println("Task 4.5 - Работа со стеком и очередью на базе связанного списка");
        Link.Queue1 queueTest = new Link.Queue1();
        queueTest.insert("Василий",12);
        queueTest.insert("Петр",20);

        startTime = System.nanoTime();
        queueTest.insert("Артем",30);
        endTime = System.nanoTime() - startTime;
        System.out.println("На выполнение метода insert в очереди на базе связанного списка ушло: " + endTime);

        startTime = System.nanoTime();
        queueTest.display();
        endTime = System.nanoTime() - startTime;
        System.out.println("На выполнение метода display в очереди на базе связанного списка ушло: " + endTime);


    }


}
