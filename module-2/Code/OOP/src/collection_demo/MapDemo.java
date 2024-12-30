package collection_demo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "Ahmed");
        employees.put(102, "Bob");
        employees.put(103, "John");
        employees.put(101, "Ahmed new");

        System.out.println(employees);

        System.out.println("Employee 102: " + employees.get(102));

        for(Map.Entry<Integer, String> entry: employees.entrySet()) {
            System.out.println("Emp: " + entry.getKey() +  " -> " + entry.getValue());
        }
    }
}
