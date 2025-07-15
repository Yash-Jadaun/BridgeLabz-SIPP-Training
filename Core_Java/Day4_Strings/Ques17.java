import java.util.Scanner;

class Ques17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[][] studentData = new String[numStudents][5]; // Name, Physics, Chemistry, Math, Total, Percentage, Grade

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            scanner.nextLine(); // Consume newline
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            int physics, chemistry, maths;
            boolean validMarks = false;
            while (!validMarks) {
                System.out.print("Enter Physics marks (0-100): ");
                physics = scanner.nextInt();
                System.out.print("Enter Chemistry marks (0-100): ");
                chemistry = scanner.nextInt();
                System.out.print("Enter Maths marks (0-100): ");
                maths = scanner.nextInt();

                if (physics >= 0 && physics <= 100 && chemistry >= 0 && chemistry <= 100 && maths >= 0 && maths <= 100) {
                    studentData[i][0] = name;
                    studentData[i][1] = String.valueOf(physics);
                    studentData[i][2] = String.valueOf(chemistry);
                    studentData[i][3] = String.valueOf(maths);
                    validMarks = true;
                } else {
                    System.out.println("Invalid marks. Marks must be between 0 and 100. Please re-enter.");
                }
            }
        }

        System.out.println("\n--- Student Scorecard ---");
        System.out.printf("%-15s %-10s %-10s %-10s %-10s %-12s %-8s %s\n",
                "Name", "Physics", "Chem", "Math", "Total", "Percentage", "Grade", "Remarks");
        System.out.println("----------------------------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            String name = studentData[i][0];
            int physics = Integer.parseInt(studentData[i][1]);
            int chemistry = Integer.parseInt(studentData[i][2]);
            int maths = Integer.parseInt(studentData[i][3]);

            int totalMarks = physics + chemistry + maths;
            double percentage = (double) totalMarks / 300 * 100;
            String grade = calculateGrade(percentage);
            String remarks = getRemarks(grade);

            System.out.printf("%-15s %-10d %-10d %-10d %-10d %-12.2f %-8s %s\n",
                    name, physics, chemistry, maths, totalMarks, percentage, grade, remarks);
        }

        scanner.close();
    }

    public static String calculateGrade(double percentage) {
        if (percentage >= 80 && percentage <= 100) {
            return "A";
        } else if (percentage >= 70 && percentage < 80) {
            return "B";
        } else if (percentage >= 60 && percentage < 70) {
            return "C";
        } else if (percentage >= 50 && percentage < 60) {
            return "D";
        } else if (percentage >= 40 && percentage < 50) {
            return "E";
        } else if (percentage >= 0 && percentage < 40) {
            return "R";
        } else {
            return "Invalid"; // Should not happen with validation
        }
    }

    public static String getRemarks(String grade) {
        switch (grade) {
            case "A": return "(Level 4, above agency-normalized standards)";
            case "B": return "(Level 3, at agency-normalized standards)";
            case "C": return "(Level 2, below, but approaching agency-normalized standards)";
            case "D": return "(Level 1, well below agency-normalized standards)";
            case "E": return "(Level 1-, too below agency-normalized standards)";
            case "R": return "(Remedial standards)";
            default: return "";
        }
    }
}