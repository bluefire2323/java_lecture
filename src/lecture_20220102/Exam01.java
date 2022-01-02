package lecture_20220102;

public class Exam01 {
    static double getObjectHeight(double fallTime){
        double fallenDistance = 9.8/2*fallTime*fallTime;
        return 1000 - fallenDistance;
    }

    public static void main(String[] args) {
        System.out.println("5.00초 후 위치 :"+getObjectHeight(5.00));
    }
}
