package lecture_20211024;

class Book {
    int price;
    int num;
    String title;

    int sum(){
        return price * num;
    }
}

public class Practice {
    public static void main(String[] args) {
        Book HarryPotter = new Book();
        HarryPotter.price = 20000;
        HarryPotter.num = 10000;
        System.out.println(HarryPotter.sum());
    }
}
