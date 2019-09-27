public class Book {

    /**
     * Variables that defines properties of an book
     * Can add more properties here
     */


    protected boolean isRented = false;
    protected String author;
    protected String title;
    protected String pages;
    protected String isbn;

    protected Book() {}

    public Book(String author, String title, String pages, String isbn) {
        this.author = author;
        this.title = title;
        this.pages = pages;
        this.isbn = isbn;


    }

    @Override
    public String toString() {
        return "LIBRARY STOCKTAKE\n" + "\nAuthor: " + author + "\nTitle: " + title + "\nPages: " + pages + "\nISBN: " + isbn;
    }
}
