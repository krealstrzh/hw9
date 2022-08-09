import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    public Book(String bookName, Author authorName, int pubYear) {
        this.bookName = bookName;
        this.author = authorName;
        this.publishYear = pubYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public String getAuthor() {
        return this.author.toString();
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author.toString() +
                ", publishYear=" + publishYear +
                '}';
    }
}
