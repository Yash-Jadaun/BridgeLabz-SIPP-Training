package Generics;

import java.util.*;

class Top5Movies {
    static class Movie {
        String name; double rating; int year;
        Movie(String n, double r, int y){ name=n; rating=r; year=y; }
        public String toString(){ return name+"("+year+", "+rating+")"; }
    }

    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("A", 8.5, 2022),
            new Movie("B", 9.0, 2023),
            new Movie("C", 7.9, 2021),
            new Movie("D", 9.5, 2023),
            new Movie("E", 8.8, 2022),
            new Movie("F", 9.1, 2023)
        );
        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m)->m.rating).reversed()
                      .thenComparingInt(m->m.year).reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
