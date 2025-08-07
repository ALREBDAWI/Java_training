package Book;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("HarryPotter", "J.K.ROWLING", 500);
        Book book2 = new Book("LordOfTheRings", "J.R.R.Tolkien", 750);
        System.out.println("Title: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", Number of Pages: " + book1.getNumPages());
        System.out.println("Title: " + book2.getTitle() + ", Author: " + book2.getAuthor() +  ", Number of Pages: " + book2.getNumPages());
    }
}
