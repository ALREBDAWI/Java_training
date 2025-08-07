package Book;

public class Book {

    private String title, author;
    private int numPages;


    public Book(String pTitle, String pAuthor, int pNumPages) {  //constructor
        this.title = pTitle;
        this.author = pAuthor;
        this.numPages = pNumPages;
    }

    //-------------------------------------adding getters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    //-------------------------------------adding setters
    public void setAuthor(String pAuthor) {
        this.author = pAuthor;
    }

    public void setTitle(String pTitle) {
        this.title = pTitle;
    }

    public void setNumPages(int pNumPages) {
        this.numPages = pNumPages;
    }



}
