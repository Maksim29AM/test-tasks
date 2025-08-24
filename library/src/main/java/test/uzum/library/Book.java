package test.uzum.library;

public class Book {

    private final Long id;
    private final String title;
    private final String author;

    public Book(Long id, String title, String author) {
        if (id == null)
            throw new IllegalArgumentException("Book id must not be null");
        if (title == null || title.isBlank())
            throw new IllegalArgumentException("Title must not be blank");
        if (author == null || author.isBlank())
            throw new IllegalArgumentException("Author must not be blank");

        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
