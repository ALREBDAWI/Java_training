package Book;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("HarryPotter", "J.K.ROWLING", -1); //testing wrong pages number entry
        Book book2 = new Book("LordOfTheRings", "J.R.R.Tolkien", 750);
        Book book3 = new Book();

        book1.printDescription();
        book2.printDescription();
        book3.printDescription();
        System.out.println("\n");

        book1.setNumPages(520); //trying a valid value again
        book1.printDescription();

        book2.setNumPages(840);
        System.out.println(book2.getNumPages());

        int TotalPages = book1.getNumPages() + book2.getNumPages();
        System.out.println("Total pages: " + TotalPages);
    }
}
