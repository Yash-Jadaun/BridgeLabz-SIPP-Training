package workshop;

import workshop.model.Login;

public class main {
    public static void main(String[] args) {
        Login login = new Login("test@example.com", "Password@123");

        boolean isAuthenticated = login.authenticate("test@example.com", "Password@123");

        System.out.println("Login successful? " + isAuthenticated);
    }
}
