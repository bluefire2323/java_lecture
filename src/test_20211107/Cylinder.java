package test_20211107;

public class Cylinder {
    Circle circle;
    double height;
    public Cylinder(Circle circ , double height){
        this.circle = new Circle(circ.radius);
        this.height = circ.height;
    }
}