package workshop.model;

public abstract class AbstractUser {
    protected String email;
    protected String password;

    public abstract boolean authenticate(String email, String password);
}
