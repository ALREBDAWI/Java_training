package Book;

public class TestPrice {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setPrice(120); //adding first price
        System.out.println(book1.getPrice());

        book1.setPrice(200); //test changing price
        System.out.println(book1.getPrice());
    }
}
