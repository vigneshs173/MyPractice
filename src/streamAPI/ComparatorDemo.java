package streamAPI;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        System.out.println("Original LinkedList: " + linkedList);


        linkedList.add(1, "Orange");
        System.out.println("LinkedList after inserting 'Orange': " + linkedList);

        linkedList.remove(2);
        System.out.println("LinkedList after deleting element at index 2: " + linkedList);


    }
}
