package Generics;

import java.util.*;

class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(101.5,102.3,99.8);
        stockPrices.forEach(System.out::println);
    }
}
