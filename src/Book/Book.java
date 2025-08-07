package Book;

public class Book {

    private String title, author;
    private int numPages;
    private double price;
    private boolean priceFix;

    public Book(){ //constructor with default values
        this.title = "title";
        this.author = "author";
        this.numPages = 10;
        this.price = 10; //minimum default price
    }

    public Book(String pTitle, String pAuthor) { //constructor 2 params
        this.title = pTitle;
        this.author = pAuthor;
    }

    //constructor 3 params
    public Book(String pTitle, String pAuthor, int pNumPages) {
        this.title = pTitle;
        this.author = pAuthor;
        //condition to assure correct entry
        if(pNumPages > 0){
            this.numPages = pNumPages;
        }else {
            this.numPages = 10; //adding 10 pages minimum
            System.out.println("Number of pages cant be less than 1 for " + title);
        }
    }
    //constructor all params
    public Book(String pTitle, String pAuthor, int pNumPages, double pPrice) {

        this.title = pTitle;
        this.author = pAuthor;

        //condition to assure correct entry
        if(pNumPages > 0){
            this.numPages = pNumPages;
        }else {
            this.numPages = 10; //adding 10 pages minimum
            System.out.println("Number of pages cant be less than 1 for " + title);
        }

        if(pPrice > 0 ){  //verify that price is above 0
            this.price = pPrice;
            priceFix = true;
        }else {
            System.out.println("Price cant be less than 1 for " + title);
        }
    }



    // getters
    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public double getPrice() {
        return price;
    }

    // setters
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
            System.out.println("Number of pages cant be less than 1 for " + title);
        }
    }

    public void setPrice(double pPrice) { //price sitter with conditions

        if(priceFix){ //one time change only
            System.out.println("you cant change price twice");
            return;
        }
        if(pPrice <= 0){
            System.out.println("Price cant be less than 1 for " + title);
            return;
        }

            this.price = pPrice;
            priceFix = true;
            System.out.println("price changed successfully");
    }

    //book description message
    public void printDescription() {
            System.out.println(title + " : " + author + " : " + " Pages : " +numPages+ " price : " + price);
    }
}
