public class Main {

    public static void main(String[] args) {
        Author tolstoy = new Author("Lev", "Tolstoy");
        Book warAndPeace = new Book("War and Peace", tolstoy, 1800);
        Author sholokhov = new Author("Mikhail", "Sholokhov");
        Book silentDon = new Book("Silent Don", sholokhov, 1928);
        warAndPeace.setPublishYear(1867);
        System.out.println(warAndPeace.getBookName() + " " + warAndPeace.getAuthor() + " " + warAndPeace.getPublishYear());
        System.out.println(silentDon.getBookName()+" "+silentDon.getAuthor()+" "+silentDon.getPublishYear());
        Library biblio = new Library(new Book[5]);
        biblio.putBook(warAndPeace);
        biblio.putBook(silentDon);
        biblio.printLibraryInfo();
        biblio.printBookInfo("war and peace");
        biblio.changePubYear("silent don", 1934);
        biblio.printBookInfo("Silent don");
        System.out.println(warAndPeace);
        System.out.println(warAndPeace.equals(silentDon));
        System.out.println(warAndPeace.hashCode() == silentDon.hashCode());
    }
}