package generics_demo;

class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class GenericClassExample {
    public static void main(String[] args) {

        // Double Box
        Box<Double> doubleBox = new Box<Double>();
        doubleBox.setValue(12.10);
        System.out.println(doubleBox.getValue());

        // Integer Class
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.setValue(1233);
        System.out.println(integerBox.getValue());


    }
}
