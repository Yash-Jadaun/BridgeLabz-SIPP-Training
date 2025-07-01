package OOPS;

class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int patientID, int age, String ailment) {
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Name: " + name);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);//
            System.out.println("Hospital: " + hospitalName);
        }
    }
}

public class HospitalRegSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Anjali", 401, 25, "Fever");
        Patient p2 = new Patient("Raj", 402, 40, "Back Pain");

        p1.displayDetails();
        System.out.println();
        p2.displayDetails();

        Patient.getTotalPatients();
    }
}

