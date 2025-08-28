package Generics.LambdaExpression;

import java.util.*;
import java.util.function.Predicate;

class Notification {
    String type; String message;
    Notification(String t, String m){ type=t; message=m; }
    public String toString(){ return type+": "+message; }
}

class NotificationFiltering {
    public static void main(String[] args) {
        List<Notification> notifications = Arrays.asList(
            new Notification("Critical","Patient heart rate abnormal"),
            new Notification("Info","Daily report ready"),
            new Notification("Warning","High blood pressure")
        );

        Predicate<Notification> onlyCritical = n -> n.type.equals("Critical");
        notifications.stream().filter(onlyCritical).forEach(System.out::println);
    }
}
