public class Library {
    private int librarySize;
    private Book[] books = new Book[librarySize];

    public Library (int librarySize) {
        this.librarySize = librarySize;
    }

    public void putBook(Library whereToPut, Book bookToPut) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookToPut;
                break;
            }
        }
    }

    public void printLibraryInfo(Library library) {
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
            if (books[i].getBookName().equals(bookName)) {
                System.out.println(books[i].getBookName() + " by " + books[i].getAuthor() + " was published in " + books[i].getPublishYear());
            }
        }
    }

    public void newPubYear(String bookName, int newYear) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equalsIgnoreCase(bookName)) {
                books[i].setPublishYear(newYear);
            }
        }
    }
}
