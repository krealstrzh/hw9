public class Library {
    private Book[] books = new Book[2];

    public void putBook(Book[] whereToPut, Book bookToPut) {
        for (int i = 0; i < whereToPut.length; i++) {
            if (whereToPut[i] == null) {
                whereToPut[i] = bookToPut;
                break;
            }
        }
    }

    public void printLibraryInf(Book[] library) {
        for (int i = 0; i < library.length; i++) {
            System.out.println(library[i].getAuthorName() + ": " + library[i].getBookName() + ": " + library[i].getPublishYear());
        }
    }

    public void printBookInfo(String bookName) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                System.out.println(books[i].getBookName() + " by " + books[i].getAuthorName() + " was published in " + books[i].getPublishYear());
            }
        }
    }

    public void newPubYear(String bookName, int newYear) {
        for (int i = 0; i < books.length; i++) {
            if (books[i].getBookName().equals(bookName)) {
                books[i].setPublishYear(newYear);
            }
        }
    }
}
