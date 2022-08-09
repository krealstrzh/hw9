import java.sql.SQLOutput;

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
                System.out.println("Пустой лот!");
                continue;
            }
        }
    }

    public void printBookInfo(String bookName) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                if (books[i].getBookName().equalsIgnoreCase(bookName)) {
//                    System.out.println(books[i].getBookName() + " by " + books[i].getAuthor() + " was published in " + books[i].getPublishYear());
                    index = i;
                    break;
                }
            } else {
                break;
            }
        }
        if (index > -1) {
            System.out.println(books[index].getBookName() + " by " + books[index].getAuthor() + " was published in " + books[index].getPublishYear());
        } else {
            System.out.println("Книга не найдена :(");
        }
    }

    public void changePubYear(String bookTitle, int newYear){
        int index = -1;
            for (int i = 0; i < books.length; i++) {
                if (books[i] != null) {
                    if (books[i].getBookName().equalsIgnoreCase(bookTitle)) {
                        index = i;
                    }
                } else {
                    break;
                }
            }
        if (index > -1) {
            books[index].setPublishYear(newYear);
            System.out.println("Год успешно изменен!");
        } else {
            System.out.println("Книга не найдена!");
        }
        }
}
