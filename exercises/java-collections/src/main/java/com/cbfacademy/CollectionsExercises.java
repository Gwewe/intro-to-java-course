package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.add(2);
        integers.add(2, 4);
        System.out.println(integers.element());
        return integers;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        Stack<Integer> stack = new Stack<Integer>();
    //  - add 5, 6, 8, 9 to the the stack
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
    //  - print the first element of the stack on the screen
        System.out.print(stack.firstElement());
    //  - print the last element of the stack on the screen
        System.out.print(stack.lastElement());
    //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(stack.pop());
    //  - invoke the push(4) method on the stack
        stack.push(4);
    //  - return the stack
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
    //  - add 5, 6, 8, 9 to the the stack
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
    //  - print the first element of the queue on the screen
        System.out.print(arrayDeque.getFirst());
    //  - print the last element of the queue on the screen
        System.out.print(arrayDeque.getLast());
    //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(arrayDeque.poll());
    //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(arrayDeque.element());
    //  - return the queue
        return arrayDeque;
    }

    public HashMap<Integer, String> useHashMap() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        hashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        hashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        hashMap.put(3, "Python");
        //  - add {4, Java} entry to the map
        hashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        hashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        hashMap.put(6, "Rust");
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(hashMap.keySet());
        //  - determine the set of values from the map and print it on the screen
        System.out.print(hashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(hashMap.containsValue("English"));
        //  - return the map
        return hashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
