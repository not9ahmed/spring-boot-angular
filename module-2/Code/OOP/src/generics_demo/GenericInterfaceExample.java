package generics_demo;

interface Printable<T> {
    void print(T value);
}

class Printer<T> implements Printable<T> {

    @Override
    public void print(T value) {
        System.out.println(value);
    }
}

public class GenericInterfaceExample {

    public static void main(String[] args) {
        Printer<String> printer1 = new Printer<>();

        printer1.print("something");
    }
}
