import java.util.*;
public class Library {
    private Map<String, LibraryItem> items;

    public Library() {
        items = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        items.put(item.getId(), item);
    }

    public LibraryItem findItemById(String id) {
        return items.get(id);
    }

    public void displayAllItems() {
        System.out.println("\n Library Collection:");
        for (LibraryItem item : items.values()) {
            item.displayInfo();
        }
    }
}
