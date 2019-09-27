import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> library = new ArrayList<>();
    private List<Person> persons = new ArrayList<>();
    private List<BookLoan> loanedBooks = new ArrayList<>();


    public void addBook(Book book) {
        if (library.contains(book)) {
            System.out.println("The book you're trying to add already exists in your collection...");
        } else
            library.add(book);
    }

    public void showBooks() {
        for (Book book : library) {
            if (!book.isRented)
                System.out.println(book);
        }
    }

    public void addMember(Person person) {
        persons.add(person);
    }

    public void showMembers() {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

    public void requestBookLoan(Person person, Book book) {
        BookLoan addLoan = new BookLoan(person, book);
        loanedBooks.add(addLoan);
        book.isRented = true;
    }

    public void returnBookLoan(Person person, Book book) {
        BookLoan removeLoan = new BookLoan(person, book);
        loanedBooks.remove(removeLoan);
        book.isRented = false;
    }

    public void showRentedBooks() {
        for (BookLoan bookLoan : loanedBooks) {
            System.out.println(bookLoan);
        }
    }
}



