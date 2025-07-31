package Java_collections.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Method to reverse an ArrayList without using built-in reverse
    public static List<Integer> reverseArrayList(List<Integer> list) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    // Method to reverse a LinkedList without using built-in reverse
    public static List<Integer> reverseLinkedList(LinkedList<Integer> list) {
        List<Integer> reversed = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    public static void main(String[] args) {
        // Test with ArrayList
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList: " + reverseArrayList(arrayList));

        // Test with LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));
    }
}
