package Generics;

import java.util.*;

class SensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(50, 120, 80, 150);
        readings.stream().filter(r->r>100).forEach(System.out::println);
    }
}
