public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoi");
        Book warAndPeace = new Book("War and Peace", tolstoy, 1800);
        Author sholokhov = new Author("Mikhail", "Sholokhov");
        Book silentDon = new Book("Silent Don", sholokhov, 1928);
        warAndPeace.setPublishYear(1867);
        System.out.println(warAndPeace.getBookName() + " " + warAndPeace.getAuthor() + " " + warAndPeace.getPublishYear());
        System.out.println(silentDon.getBookName()+" "+silentDon.getAuthor()+" "+silentDon.getPublishYear());
        Library books = new Library(5);
        books.putBook(books, warAndPeace);
        books.printLibraryInfo(books);
    }
}