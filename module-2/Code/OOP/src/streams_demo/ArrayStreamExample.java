package streams_demo;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ArrayStreamExample {

    static void display(String value){
        System.out.println(value);
    }

    public static void main(String[] args) {
        System.out.println("Stream from array");

        String[] courses = {
                "HTML",
                "CSS",
                "JavaScript",
                "Java",
                "Spring Boot",
                "Angular"
        };


        Stream<String> courseStream = Arrays.stream(courses);

//        assigning static method to display stream values
//        courseStream.forEach(ArrayStreamExample::display);

//
//        courseStream.forEach(System.out::println);
        courseStream.forEach(el -> display(el));

        

    }
}
