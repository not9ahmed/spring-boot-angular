package collection_demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListDemo {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Cherry");
        fruits.add("Orange");

        System.out.println(fruits);
        fruits.forEach(el -> System.out.println("Fruit: "+el));

        System.out.println("Element 0"+ fruits.getFirst());

        // Integer array list
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(34);
        nums.add(56);
        System.out.println(nums);


        Integer sum = 0;
        for (Integer num: nums){
            sum += num;
        }
        System.out.println("Sum: "+ sum);

        Integer reduce = nums.stream().reduce((tot, el) -> tot += el).get();
        System.out.println(reduce);
    }
}
