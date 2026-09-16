package se.iths.vincent_richard.libraryapp;

public class Book
{
    private final Author author;
    private final String title;
    private final String isbn;
    private boolean isLoaned;

    public Book(Author author, String title, String isbn)
    {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        isLoaned = false;
    }

    public Author getAuthor()
    {
        return author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public boolean isLoaned()
    {
        return isLoaned;
    }

    public void setLoaned(boolean loaned)
    {
        isLoaned = loaned;
    }

    @Override
    public String toString()
    {
        return String.format("%s written by: %s\nISBN: %s", title, author.toString(), isbn);
    }
}
