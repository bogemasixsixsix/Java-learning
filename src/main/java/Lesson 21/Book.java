public class Book {
    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void displayInfo() {
        System.out.println("Title is: " + title);
        System.out.println("Author is: " + author);
        System.out.println("Number of pages is: " + pages);
        System.out.println();
    }
}
