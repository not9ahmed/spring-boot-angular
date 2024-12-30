package streams_demo;

import java.util.List;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return name + " salary is " + salary;
    }
}

public class EmployeeStreamExample {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("Ahmed", 1023),
                new Employee("John", 1100),
                new Employee("Ann", 2000),
                new Employee("Bob", 400)
        );

        System.out.println(employees);


        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.salary > 1000)
                .filter(emp -> emp.name.startsWith("A"))
                .toList();

        filteredEmployees.forEach(System.out::println);

    }
}
