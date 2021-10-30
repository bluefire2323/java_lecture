package Practice_20211030;

class Book {
    int price = 9;
    int total = price + 2;
}

public class BookShelf {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.price = 3;
        book1.total = 15;
        System.out.println(book1.price + book1.total);
    }
}
