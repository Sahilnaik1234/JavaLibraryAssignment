public class Book extends LibraryItem implements Borrowable {
    private String author;
    private String borrowedBy; // to track who borrowed the book

    public Book(String id, String title, String author) {
        super(id, title, true); // new books are available
        this.author = author;
        this.borrowedBy = null;
    }

    @Override
    public void borrowItem(String userId) throws BookNotAvailableException {
        if (!isAvailable) {
            throw new BookNotAvailableException(
                    "Book '" + title + "' is already borrowed by user: " + borrowedBy
            );
        }
        isAvailable = false;
        borrowedBy = userId;
        System.out.println( userId + " borrowed the book: " + title);
    }

    @Override
    public void returnItem(String userId) throws InvalidReturnException {
        if (isAvailable) {
            throw new InvalidReturnException("Book '" + title + "' is not currently borrowed.");
        }
        if (!userId.equals(borrowedBy)) {
            throw new InvalidReturnException(
                    "Invalid return attempt! '" + userId + "' cannot return book borrowed by '" + borrowedBy + "'."
            );
        }
        isAvailable = true;
        borrowedBy = null;
        System.out.println( userId + " returned the book: " + title);
    }

    @Override
    public void displayInfo() {
        System.out.println(
                "Book ID: " + id +
                        ", Title: " + title +
                        ", Author: " + author +
                        ", Available: " + (isAvailable ? "Yes" : "No")
        );
    }
}
