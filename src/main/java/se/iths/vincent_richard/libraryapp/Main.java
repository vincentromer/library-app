package se.iths.vincent_richard.libraryapp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Borrower> borrowers = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Loan> loans = new ArrayList<>();

        IO.println(new Author("Billy Mays").toString());
        Author bob = new Author("Bob");
        Author nils = new Author("Nils");

        Book bookHorse = new Book(bob, "Tio hästar", "978-1-78280-808-4");
        Book bookPizza = new Book(nils, "Hur man gör kebab-pizza", "640-1-23242-190-2");
        Book bookHorseV2 = new Book(bob, "Tjugo hästar", "978-1-98000-890-5");
        Book bookDogs = new Book(nils, "Fem hundar", "910-1-42309-421-2");
        IO.println(bookHorse.toString());

        Borrower erik = new Borrower("Erik", "erik", "password123");
        Borrower felix = new Borrower("Felix", "felix", "wordpass321");
        IO.println(erik.toString());

        Loan erikLoan = new Loan(erik, bookHorse);
        Loan felixLoan = new Loan(felix, bookPizza);
        IO.println(erikLoan.toString());


        borrowers.add(erik);
        borrowers.add(felix);

        books.add(bookHorse);
        books.add(bookPizza);
        books.add(bookHorseV2);
        books.add(bookDogs);

        loans.add(erikLoan);
        loans.add(felixLoan);


        for (Borrower borrower : borrowers) {
            IO.println(borrower.toString());
        }
        for (Book book : books) {
            IO.println(book.toString());
        }
        for (Loan loani : loans) {
            IO.println(loani.toString());
        }

    }
}
