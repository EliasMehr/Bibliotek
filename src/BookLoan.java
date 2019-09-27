public class BookLoan extends Book {
    Book book;
    Person person;

    public BookLoan(Person person, Book book) {
        this.book = book;
        this.person = person;
    }

    @Override
    public String toString() {
        return this.book + "\n\nThis book is rented by: " + this.person.person_Name;
    }
}
