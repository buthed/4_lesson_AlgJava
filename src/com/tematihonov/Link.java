package com.tematihonov;

public class Link {
    public String name;
    public int age;

    public Link next;

    public Link(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display () {
        System.out.println(("Name " + this.name + ", age " + this.age));
    }

    public static class Queue1 {
        private LinkedList queue;

        Queue1() {
            queue = new LinkedList();
        }

        public void insert (String name, int age){
            queue.insert(name, age);
        }

        public Link delete () {
            return queue.delete();
        }

        public boolean isEmpty () {
            return queue.isEmpty();
        }

        public void display () {
            queue.display();
        }
    }

    static class LinkedList {
        public Link first;

        public LinkedList () {
            first = null;
        }

        public boolean isEmpty() {
            return (first == null);
        }

        public void insert (String name, int age){
            Link newLink = new Link(name, age);
            newLink.next = first;
            first = newLink;
        }

        public  Link delete () {
            Link temp = first;
            first = first.next;
            return temp;
        }

        public void display() {
            Link current = first;
            while (current != null) {
                current.display();
                current = current.next;
            }
        }
    }
}
