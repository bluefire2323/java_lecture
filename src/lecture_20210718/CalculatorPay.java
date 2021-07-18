package lecture_20210718;

import java.util.Scanner;

public class CalculatorPay {
    public static void printPay(int wt, double tp){
        if(wt<=40){
            System.out.println(wt*tp+"$");
        }
        else{
            System.out.println(40*tp+((double)wt-40)*tp*1.5+'$');
        }
        if(wt>60){
            System.out.println("경고: 근무시간 초과");
        }
        if(tp<8){
            System.out.println("경고: 최저시급 미지급");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("근무 시간을 입력하세요");
        int wt = scan.nextInt();
        System.out.println("시급을 입력하세요");
        double tp = scan.nextDouble();
        printPay(wt,tp);
        System.out.println("프로그램 종료");
    }
}
