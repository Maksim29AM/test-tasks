package test.uzum.library;

public class MainLibrary {
    public static void main(String[] args) {

        Library library = new Library();

        Book book1 = new Book(1L, "Java Head First", "Katty Sierra");
        Book book2 = new Book(2L, "Harry Potter", "J.K. Rowling");
        Book book3 = new Book(3L, "Grokking Algorithms", "Aditya Bhargava");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("All books:");
        library.getAllBooks().forEach(System.out::println);

        System.out.println("\nGet id=3:");
        System.out.println(library.getBookInfo(3L).orElse(null));

        System.out.println("\nGet id=7 (not exists):");
        System.out.println(library.getBookInfo(7L).orElse(null));

        System.out.println("\nRemove id=2:");
        System.out.println(library.removeBookById(2L) ? "Deleted" : "Not found");
        System.out.println("Remove id=2:");
        System.out.println(library.removeBookById(2L) ? "Deleted" : "Not found");

        System.out.println("\nAll books:");
        library.getAllBooks().forEach(System.out::println);
    }
}
