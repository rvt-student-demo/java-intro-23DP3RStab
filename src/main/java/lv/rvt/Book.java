package lv.rvt;

public class Book {
    private String title;
    private int pages;
    private int publicationYear;

    public Book(String initialTitle, int initialPages, int initialPublicationYear) {
        this.title = initialTitle;
        this.pages = initialPages;
        this.publicationYear = initialPublicationYear;
    }

    public void whatToPrint(String choice) {
        if (choice.equalsIgnoreCase("everything")) {
            System.out.println(this.title + ", " + this.pages + " pages, " + this.publicationYear);
        } else if (choice.equalsIgnoreCase("name")) {
            System.out.println(this.title);
        }
    }

}
