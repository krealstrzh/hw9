public class Author {
    private static String firstName;
    private static String lastName;

    public Author(String firstN, String lastN) {
        this.firstName = firstN;
        this.lastName = lastN;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
