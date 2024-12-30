# OOP


## Threads and Concurrency

**Thread Lifecycle**

1. New
2. Runnable
3. Running
4. Blocked/Waiting
5. Terminated


**Creating Thread**

* Extending Thread class
* Implement Runnable Interface

```java
Thread.start();
```


```java
// Lambda expression with Thread runnable interface
Runnable t3 = () -> bank.fundTransfer(account2, account3, 1000);
Thread t3 = new Thread(t3Runnable);


// Even shorter expression
// Lambda expression with Thread runnable interface
Thread t4 = new Thread(() -> bank.fundTransfer(account2, account3, 1000));
```


## Interfaces and Abstract Class

### Abstract Class

```java
public abstract class myClass {


}
```

### Interfaces

default in interface

No need to implement it, but once it's implement it will be overridden.

2 default methods inherited will throw a warning.

```java
default int mul(int n1, int n2) {
    return n1 * n2;
}
```


## Generics



**Advantages**

1. Type Saftey
2. Eliminates Type Casting
3. Code Reusability
4. Compile-Ttime Checking

## Wrapper Class

## Collections Framework

JCF

* List Ordered Collection (ArrayList)
* Set Unordered Collection (HashSet)
* Queue FIFO/LIFO (LinkedList)
* Map Key/Value (HashMap)

## Streams and Lambda Expression

- Source
- Intermediate Operations
- Terminal Operation



**Things to learn**

- Thread types
- synchronized thread
- Java Runnable
- Stream
- Method Reference