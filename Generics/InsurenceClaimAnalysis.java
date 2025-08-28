package Generics;

import java.util.*;
import java.util.stream.*;

class InsuranceClaimAnalysis {
    static class Claim {
        String type; double amount;
        Claim(String t, double a){ type=t; amount=a; }
    }

    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health",1000),
            new Claim("Car",2000),
            new Claim("Health",3000),
            new Claim("Car",1000)
        );
        Map<String, Double> avg = claims.stream()
                .collect(Collectors.groupingBy(c->c.type, Collectors.averagingDouble(c->c.amount)));
        System.out.println(avg);
    }
}
