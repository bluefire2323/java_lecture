package lecture_20210829;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        //크기가 3인 int 배열 intArr 선언
        int[] intArr = new int[4];
        intArr[0] = 10;
        intArr[1] = 1;
        intArr[2] = 44;
        intArr[3] = 55;

        System.out.println(intArr[3]);

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(1);
        intList.add(44);
        intList.add(55);

        System.out.println(intList.get(3));
        System.out.println("===== remove index 0 =====");
        intList.remove(0);
        for(int i : intList){
            System.out.println(i);
        }

        System.out.println("===== clear =====");
        intList.clear();
        for(int i : intList){
            System.out.println(i);
        }

        System.out.println("===== size =====");
        System.out.println(intList.size());

        System.out.println("===== isEmpty");
        System.out.println(intList.isEmpty());

    }
}
