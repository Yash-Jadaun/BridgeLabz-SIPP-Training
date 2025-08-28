package Generics;

import java.util.*;

class TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ravi","ajay","kiran","bhavesh");
        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
