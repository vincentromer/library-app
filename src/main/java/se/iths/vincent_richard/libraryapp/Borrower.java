package se.iths.vincent_richard.libraryapp;

public class Borrower
{
    private String name;
    private final String username;
    private String password;

    public Borrower(String name, String username, String password)
    {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Username: " + username + "\nNamn: " + name;
    }
}
