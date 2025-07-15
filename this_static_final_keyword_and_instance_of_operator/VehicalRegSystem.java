package OOPS.this_static_final_keyword_and_instance_of_operator;

class Vehicle {
    static double registrationFee = 1500.00;

    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class VehicalRegSystem {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ravi", "Car", "DL01AB1234");
        Vehicle v2 = new Vehicle("Neha", "Bike", "MH12XY5678");

        v1.displayRegistrationDetails();
        System.out.println();
        Vehicle.updateRegistrationFee(1800.00);
        v2.displayRegistrationDetails();
    }
}
