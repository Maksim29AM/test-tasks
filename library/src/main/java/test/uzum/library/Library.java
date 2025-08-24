package test.uzum.library;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Library {

    private final List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        if (book == null) {
            throw new IllegalArgumentException("Book must not be null");
        }
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return Collections.unmodifiableList(books);
    }

    public Optional<Book> getBookInfo(Long idBook) {
        if (idBook == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        return books.stream()
                .filter(book -> book.getId().equals(idBook))
                .findFirst();
    }

    public boolean removeBookById(Long idBook) {
        if (idBook == null) {
            throw new IllegalArgumentException("Id must not be null");
        }
        return books.removeIf(book -> book.getId().equals(idBook));
    }
}
