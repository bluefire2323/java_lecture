package java_exam;
import java.util.Scanner;
public class Order {
    void setMenu(){
        System.out.println("#############################################");
        System.out.println("스타벅스에 오신것을 환영합니다.\n");
        System.out.println("원하시는 메뉴를 골라주세요.\n\n");
        System.out.println("1.커피");
        System.out.println("2.에이드");
        System.out.println("3.케익");
        System.out.println("4.과일");
        System.out.println("5.초콜릿\n");
        System.out.println("0.매장을 나간다\n");
        System.out.println("#############################################");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();
        switch (answer){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                System.out.println("안녕히 계세요.");
        }
    }

}
