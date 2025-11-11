public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("1", "Java", "James joslin");
        Book b2 = new Book("2", "Python", "Sahil");
        Book b3 = new Book("3", "Javascript", "Eldrich");

        library.addItem(b1);
        library.addItem(b2);
        library.addItem(b3);
        library.displayAllItems();

        System.out.println("\n=== Borrowing Books ===");
        try {
            b1.borrowItem("User1");
            b2.borrowItem("User2");
            b1.borrowItem("User3");
        } catch (BookNotAvailableException e) {
            System.out.println( e.getMessage());
        }

        System.out.println("\n  Returning Books ");
        try {
            b1.returnItem("User1");
            b2.returnItem("User3");
        } catch (InvalidReturnException e) {
            System.out.println( e.getMessage());
        }

        library.displayAllItems();
    }
}
