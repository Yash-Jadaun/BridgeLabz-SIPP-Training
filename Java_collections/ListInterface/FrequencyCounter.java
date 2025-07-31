package Java_collections.ListInterface;

import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String s : list) {
            frequencyMap.put(s, frequencyMap.getOrDefault(s, 0) + 1);
        }
        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> result = countFrequency(items);
        System.out.println(result);
    }
}