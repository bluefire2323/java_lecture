package lecture_20210718;

import java.util.Scanner;

public class CalculatorMethod {
    public static double calculate(int n, char operation, int m){
        double sum;
        double dn = (double)n;
        double dm = (double)m;
        if(operation == '+'){
            sum = dn+dm;
        }
        else if(operation == '-'){
            sum = dn-dm;
        }
        else if(operation == '*'){
            sum = dn*dm;
        }
        else{
            sum = dn/dm;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Input1 = scan.nextInt();
        char InputChar = scan.next().charAt(0);
        int Input2 = scan.nextInt();
        System.out.println(calculate(Input1, InputChar, Input2));
    }
}
