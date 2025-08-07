package Book;

public class TestBook {
    public static void main(String[] args) {

        //creating books using different constructors
        Book book1 = new Book("HarryPotter", "J.K.ROWLING", -1); //testing wrong pages number value
        Book book2 = new Book("LordOfTheRings", "J.R.R.Tolkien", 750, 95);
        Book book3 = new Book();

        //books description
        book1.printDescription();
        System.out.println("\n");
        book2.printDescription();
        System.out.println("\n");
        book3.printDescription();
        System.out.println("\n");

        //trying a valid value again
        book1.setNumPages(520);
        book1.printDescription();

        int TotalPages = book1.getNumPages() + book2.getNumPages();
        System.out.println("Total pages: " + TotalPages);
    }
}
