public abstract class LibraryItem {
    protected String id;
   protected String title;
   protected boolean isAvailable;
    LibraryItem(String id,String title,boolean isAvailable){
        this.id=id;
        this.title=title;
        this.isAvailable=isAvailable;
    }
    public abstract void displayInfo();
    public boolean isAvailable() {
        return isAvailable;
    }

    public String getId() {
        return id;
    }
}
