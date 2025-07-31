package Java_collections.ListInterface;

import java.util.*;

public class RotateList {
    public static <T> List<T> rotate(List<T> list, int k) {
        int n = list.size();
        List<T> rotated = new ArrayList<>();
        for (int i = k; i < n; i++) rotated.add(list.get(i));
        for (int i = 0; i < k; i++) rotated.add(list.get(i));
        return rotated;
    }

    public static void main(String[] args) {
        List<Integer> original = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> rotated = rotate(original, 2);
        System.out.println(rotated);
    }
}
