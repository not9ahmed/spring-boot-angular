package collection_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class ProductCategoryExample {

    public static void main(String[] args) {
        HashMap<Integer, ArrayList<String>> categories= new HashMap<>();

        ArrayList<String> electronics = new ArrayList<>();
        electronics.add("Phone");
        electronics.add("Tablet");
        electronics.add("Headphones");
        categories.put(101, electronics);

        ArrayList<String> clothing = new ArrayList<String>(List.of("Clothing", "Jackets", "Shoes"));
        categories.put(102, clothing);

        System.out.println(categories);

    }
}
