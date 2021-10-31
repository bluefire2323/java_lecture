package lecture_20211031;

public class Car {
    private String brand;
    private double maxSpeed;
    private int price;
    private String model;
    private boolean saleFlag;

    Car(){}
    Car(String brand, double maxSpeed,int Price,String model, boolean saleFlag){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = Price;
        this.model = model;
        this.saleFlag = saleFlag;
    }

    public void printCarInfo(){
        System.out.println("브랜드는 ?" + this.brand);
        System.out.println("최고 속도는 ?" + this.maxSpeed);
        System.out.println("가격은 ?" + this.price);
        System.out.println("모델은 ?" + this.model);

        getSaleInfo();

    }
    public double getSalePrice(int price) {
        this.price = price;
        //딜러 할인 + 크리스마스 할인 + 세금감면
        double salePrice = this.price - (1000 + 500 + this.price*0.1);

        return salePrice;
    }
    public void getTaxInfo(int price) {
        this.price = price;
        System.out.println("자동차 세금은 : " + (double)this.price*0.01);
    }
    private void getSaleInfo(){
        if(this.saleFlag) System.out.println("세일중입니다");
        else System.out.println("세일 기간이 아닙니다");
    }

    public String getBrand() {
        return brand;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public boolean isSaleFlag(boolean b) {
        return saleFlag;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSaleFlag(boolean saleFlag) {
        this.saleFlag = saleFlag;
    }
}
