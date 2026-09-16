package se.iths.vincent_richard.libraryapp;

import java.time.LocalDateTime;

public class Loan {
    private LocalDateTime loanDate;
    private Borrower borrower;
    private Book book;

    public Loan(Borrower borrower, Book book) {
        this.borrower = borrower;
        this.book = book;
        loanDate = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Låntagare: " + borrower.getName() + "\nBok: " + book.getTitle() + "\nLånedatum: " + loanDate;
    }
}
