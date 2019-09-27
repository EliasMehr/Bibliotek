public class Main {

    public static void main(String[] args) {

        // Running the library :

        Library library = new Library();

        // Creating books for the library :

        Book b1 = new Book("J.K Rowling", "Harry Potter - Chamber of secrets", "600", "90-90-90-90");
        Book b2 = new Book("R.R Tolken", "The lord of the rings - The two towers", "800", "80-80-80-80");
        Book b3 = new Book("R.R Tolken", "The lord of the rings - Return of the king", "800", "80-80-80-90");

        // Creating library members :

        Person m1 = new Person("Elias Mehr", "890116-7430");
        Person m2 = new Person("Firas Yonansson" , "900122-0152");
        Person m3 = new Person("Ashraf", "890116-7430");

        // Adding books to the library "database"
        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);

        //library.addBook(b1);

        library.addMember(m1);
        library.addMember(m2);
        library.addMember(m3);

        // Request a book loan for specified member & book :

        library.requestBookLoan(m3, b2);

        // Show rented books & show stocktake of the library
        library.showRentedBooks();

        //library.showBooks();

    }
}
