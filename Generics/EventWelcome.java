package Generics;

import java.util.*;

class EventWelcome {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Alice","Bob","Charlie");
        attendees.forEach(a->System.out.println("Welcome "+a));
    }
}
