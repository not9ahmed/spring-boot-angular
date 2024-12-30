package multi_thread_demo;

// Thread creation by extending Thread class
class Task1 extends Thread {
    public void run(){
        System.out.println("Task 1 is running");
    }
}

// Thread creation by implementing Runnable interface
class Task2 implements Runnable {

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name + " is running");

        try {


            // manually interpret thread
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Task 2 is running");
    }
}

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main process");



        // Thread 2
        Thread task2 = new Thread(new Task2());
        task2.setName("Task 2");
        task2.setPriority(2);
        task2.start();

        // task 1 will not start unless task 2 finish
        task2.join();

        // Thread 1
        // step 1
        Task1 task1 = new Task1();
        // adding priority
        task1.setPriority(1);
        // step 2
        task1.start();




        // can be used to merge the thread to original process
        // can also be used to manage the order
        task1.join();


        System.out.println("Main process End");


    }
}
