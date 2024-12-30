package collection_demo;

import java.util.LinkedList;
import java.util.Stack;

public class QueueDemo {

    public static void main(String[] args) {

        // FIFO - Queue
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("task 1");
        tasks.add("task 2");
        tasks.add("task 3");

        System.out.println(tasks);

        // process task
        // take from the start
        while(!tasks.isEmpty()){
            System.out.println("Current: " + tasks.poll());
        }

        System.out.println(tasks);


        // LIFO - Stack
        Stack<String> stack = new Stack<>();
        stack.add("method 1");
        stack.add("method 2");
        stack.add("method 3");

        System.out.println("Stack methods: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Executing: " + stack.pop());
        }

        System.out.println(stack);

    }
}
