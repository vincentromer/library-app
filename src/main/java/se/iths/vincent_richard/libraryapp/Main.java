package se.iths.vincent_richard.libraryapp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final String MENU =
            """
                    1. List all books
                    2. Quit
                    Choice:\s""";

    static List<Borrower> borrowers = new ArrayList<>();
    static List<Book> books = new ArrayList<>();
    static List<Loan> loans = new ArrayList<>();

    static void main(String[] args) {
        setup();

        String username = IO.readln("Username: ");
        String password = IO.readln("Password: ");

        Borrower currentBorrower = null;

        if(username.isBlank() || password.isBlank())
        {
            IO.println("No goodie...");
        }

        for(Borrower borrower : borrowers)
        {
            if(borrower.getUsername().equals(username) && borrower.getPassword().equals(password))
            {
                currentBorrower = borrower;
                break;
            }
        }
        if (currentBorrower != null)
        {
            IO.println("logged in " + currentBorrower);
        }
        else
        {
            IO.println("Wrong username or password!");
        }

        boolean running = true;
        while(running)
        {
            String input = IO.readln(MENU);

            switch (input)
            {
                case "1":
                    for(Book book : books)
                    {
                        IO.println(book);
                    }
                    break;
                case "3":
                    running = false;
                    break;
            }


        }

    }

    private static void setup()
    {
        Author bob = new Author("Bob");
        Author nils = new Author("Nils");

        Book bookHorse = new Book(bob, "Tio hästar", "978-1-78280-808-4");
        Book bookPizza = new Book(nils, "Hur man gör kebab-pizza", "640-1-23242-190-2");
        Book bookHorseV2 = new Book(bob, "Tjugo hästar", "978-1-98000-890-5");
        Book bookDogs = new Book(nils, "Fem hundar", "910-1-42309-421-2");

        Borrower erik = new Borrower("Erik", "erik", "password123");
        Borrower felix = new Borrower("Felix", "felix", "wordpass321");

        borrowers.add(erik);
        borrowers.add(felix);

        books.add(bookHorse);
        books.add(bookPizza);
        books.add(bookHorseV2);
        books.add(bookDogs);

    }
}
