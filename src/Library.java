public class Library {
    private final Book[] books;

    public Library (Book[] books) {
        this.books = books;
    }

    public void putBook(Book bookToPut) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookToPut;
                break;
            }
        }
    }

    public void printLibraryInfo() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthor() + ": " + books[i].getBookName() + ": " + books[i].getPublishYear());
            } else {
                break;
            }
        }
    }

    public void printBookInfo(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getBookName().equalsIgnoreCase(bookName)) {
                    System.out.println(books[i].getBookName() + " by " + books[i].getAuthor() + " was published in " + books[i].getPublishYear());
                } else {
                    System.out.println("Книга не найдена :(");
                }
            } else {
                break;
            }
        }
    }

    public void changePubYear(String bookTitle, int newYear){
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    if (books[i].getBookName().equalsIgnoreCase(bookTitle)) {
                        books[i].setPublishYear(newYear);
                    }
                } else {
                    break;
                }
            }
        }
}
