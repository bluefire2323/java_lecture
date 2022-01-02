package lecture_20220102;

public class Exam03 {
    static int calculatePay(int hourPay, int workTime){
        return hourPay * workTime;
    }
    public static void main(String[] args) {
        System.out.println(calculatePay(8000, 160));
    }
}
