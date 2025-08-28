package Generics;

import java.util.*;

class DoctorAvailability {
    static class Doctor {
        String name; String specialty; boolean weekendAvailable;
        Doctor(String n, String s, boolean w){ name=n; specialty=s; weekendAvailable=w; }
        public String toString(){ return name+"-"+specialty; }
    }

    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("DrA","Cardio",true),
            new Doctor("DrB","Neuro",false),
            new Doctor("DrC","Ortho",true)
        );
        doctors.stream()
               .filter(d->d.weekendAvailable)
               .sorted(Comparator.comparing(d->d.specialty))
               .forEach(System.out::println);
    }
}
