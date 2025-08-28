package Generics;



import java.util.*;

class EmailNotifications {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("a@mail.com","b@mail.com");
        emails.forEach(email->sendEmailNotification(email));
    }

    static void sendEmailNotification(String email){
        System.out.println("Sending email to "+email);
    }
}
