package Book;

public class Book {

    private String title, author;
    private int numPages;

    //constructor
    public Book(String pTitle, String pAuthor, int pNumPages) {
        this.title = pTitle;
        this.author = pAuthor;
        //condition to assure correct entry
        if(pNumPages > 0){
            this.numPages = pNumPages;
        }else {
            this.numPages = 10; //adding 10 pages minimum
            System.out.println("Number of pages cant be less than 1");
        }

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

    public void setNumPages(int pNumPages) { //condition to assure correct entry
        if(pNumPages > 0){
            this.numPages = pNumPages;
        }else {
            this.numPages = 10; //adding 10 pages minimum
            System.out.println("Number of pages cant be less than 1");
        }
    }



}
