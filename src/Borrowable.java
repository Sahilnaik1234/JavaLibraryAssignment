public interface Borrowable {
    void borrowItem(String userId) throws BookNotAvailableException;
    void returnItem(String userId) throws InvalidReturnException;
}
