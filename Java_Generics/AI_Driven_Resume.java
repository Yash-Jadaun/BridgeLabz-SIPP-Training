package Java_Generics;

abstract class JobRole {
    abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    String getRoleName() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    String getRoleName() {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {
    private String candidateName;
    private T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getRole() {
        return role;
    }
}

class ResumeProcessor {
    public void processResumes(java.util.List<? extends JobRole> roles) {
        for (JobRole r : roles) {
            System.out.println("Screening for role: " + r.getRoleName());
        }
    }
}
