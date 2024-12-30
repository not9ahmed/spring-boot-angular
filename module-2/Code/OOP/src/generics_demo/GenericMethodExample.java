package generics_demo;

public class GenericMethodExample {

    public static <T> void displayData(T data) {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {

        displayData(100);
        displayData("some string");
    }
}
