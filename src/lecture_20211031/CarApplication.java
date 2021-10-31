package lecture_20211031;

public class CarApplication {
    public static void main(String[] args) {
        Car A7 = new Car();
        A7.setBrand("audi");
        A7.setPrice(10000000);
        A7.setMaxSpeed(250);
        A7.setModel("A7");
        A7.setSaleFlag(false);

        A7.getTaxInfo(A7.getPrice());
        A7.getSalePrice(A7.getPrice());
        A7.printCarInfo();

        Car morning = new Car("현대",100,10000000,"morning",true);
        morning.printCarInfo();

    }
}
