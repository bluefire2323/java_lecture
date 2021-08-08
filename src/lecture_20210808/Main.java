package lecture_20210808;

public class Main {
    public static void main(String[] args) {
        Food apple = new Food();
        apple.printInfo();

        apple.tasteRate = 3;
        apple.color = "red";
        apple.kind = "fruit";

        apple.printInfo();

        apple.changeTestRate(1);
        apple.printInfo();
        Food melon = new Food();
        melon.tasteRate = 3628800;
        melon.color = "yellow";
        melon.kind = "fruit";
        melon.printInfo();
        melon.changeTestRate(1001);
        melon.printInfo();

        Food orange = new Food("열대과일");
        orange.printInfo();

        Food peach = new Food("통조림","분홍이");
        peach.printInfo();
        peach.tasteRate = 10;
        peach.printInfo();
    }
}
