public class Book {
    private String bookName;
    private Author author;
    private int publishYear;

    public Book (String bookName, Author author, int pubYear) {
        this.bookName = bookName;
        this.author = author;
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
}
