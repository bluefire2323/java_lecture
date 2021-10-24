package lecture_20210718;

import java.util.Random;

public class Lecture01 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sum = 0;
        for(int i = 0;i<5;i++){
            sum+=getRandomInt(1,6);
        }
        System.out.println("income: $ "+sum);
        System.out.println("rating: $ "+(sum-18));
    }
    public static int getRandomInt(double min,double max) {
        return (int) (Math.random() * 6 + 1);
    }
}
