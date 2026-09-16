package se.iths.vincent_richard.libraryapp;

public class Main {
    public static void main(String[] args) {
        IO.println(new Author("Billy Mays").toString());
        Author bob = new Author("Bob");

        Book book = new Book(bob, "Tio hästar", "978-1-78280-808-4");
        IO.println(book.toString());

    }
}
