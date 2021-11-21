package LOL;

import java.util.Scanner;

public class GameSelect {
    void selectGame(){
        System.out.println("게임을 선택해 주세요");
        System.out.println("1.일반게임");
        System.out.println("2.랭크게임");
        System.out.println("3.우르프");
        System.out.println("4.단일챔피언");
        System.out.println("5.AI");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        switch (value){
            case 1:
                System.out.println("일반게임을 선택하셨습니다. 일반게임을 매칭 중입니다.");
                break;
            case 2:
                System.out.println("랭크게임을 선택하셨습니다. 랭크게임을 매칭 중입니다.");
                break;
            case 3:
                System.out.println("우르프를 선택하셨습니다. 우르프를 매칭 중입니다.");
                break;
            case 4:
                System.out.println("단일챔피언을 선택하셨습니다. 단일챔피언을 매칭 중입니다.");
                break;
            case 5:
                System.out.println("AT를 선택하셨습니다. AI를 매칭 중입니다.");
                break;
        }
    }
}
