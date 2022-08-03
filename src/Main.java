public class Main {
    public static void putBook(Book[] whereToPut, Book bookToPut) {
        for (int i = 0; i < whereToPut.length; i++) {
            if (whereToPut[i] == null) {
                whereToPut[i] = bookToPut;
                break;
            }
        }
    }
    public static void printLibraryInfo (Book[] library) {
        for (int i = 0; i <library.length ; i++) {
                System.out.println(library[i].getAuthorName()+": "+library[i].getBookName()+": "+library[i].getPublishYear());
        }
    }
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoi");
        Book warAndPeace = new Book("War and Peace", tolstoy.getFirstName() + " " + tolstoy.getLastName(), 1800);
        Author sholokhov = new Author("Mikhail", "Sholokhov");
        Book silentDon = new Book("Silent Don", sholokhov.getFirstName() + " " + sholokhov.getLastName(), 1928);
        warAndPeace.setPublishYear(1867);
//        System.out.println(warAndPeace.getBookName() + " " + warAndPeace.getAuthorName() + " " + warAndPeace.getPublishYear());
//        System.out.println(silentDon.getBookName()+" "+silentDon.getAuthorName()+" "+silentDon.getPublishYear());
        Book[] books = new Book[2];
        putBook(books, warAndPeace);
        putBook(books, silentDon);
        printLibraryInfo(books);
    }
}