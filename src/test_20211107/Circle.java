package test_20211107;

class Circle {

    public double radius;

    public double height;

    public static double PI = 3.141592;


    //생성자 구현

    public Circle(double Radius) {

        this.radius = Radius;

    }

    //현재 반지름을 사용하여 원의 면적을 구하는 메소드

    public double getArea() {

        return this.radius * this.radius * PI;

    }

    public double getVolume() {
        return getArea() * height;
    }
}