

package workshop.model;

public class User {
    private String name;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
    private int age;
    private String pincode;

    public User(String name, String firstName, String lastName, String phoneNumber,
                String email, String password, int age, String pincode) {
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.age = age;
        this.pincode = pincode;
    }

    // Getters and setters...
    // (Same as above – not repeated for brevity)
}
