package LOL;

import java.util.Random;
import java.util.Scanner;

public class GamePlay {
    void LeagueOfLegends(int position) {
        System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
        System.out.print("페이커님의 포지션은 ");
        String positionName = " ";
        switch (position) {
            case 0:
                System.out.println("탑입니다.");
                positionName = "탑";
                break;
            case 1:
                System.out.println("미드입니다.");
                positionName = "미드";
                break;
            case 2:
                System.out.println("정글입니다.");
                positionName = "정글";
                break;
            case 3:
                System.out.println("서폿입니다.");
                positionName = "서폿";
                break;
            case 4:
                System.out.println("원딜입니다.");
                positionName = "원딜";
                break;
        }
        int ourAtk = 0;
        int theirAtk = 0;
        System.out.println("시작 아이템을 구입해 주세요.");
        System.out.println("아이템         공격력   가격");
        System.out.println("1.도란의 반지   +1      400");
        System.out.println("2.도란의 검     +5      400");
        System.out.println("3.도란의 방패   -10     450");
        System.out.println("4.신발         +0      300");
        Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();
        int ourHp = 1;
        int theirHp = 0;
        int answer = 0;
        int remainedTheirHp = 0;
        int remainedOurHp = 0;
        switch (item) {
            case 1:
                System.out.println("도란의 반지를 구입하셨습니다.");
                ourAtk = ourAtk + 1;
                break;
            case 2:
                System.out.println("도란의 검을 구입하셨습니다.");
                ourAtk = ourAtk + 5;
                break;
            case 3:
                System.out.println("도란의 방패를 구입하셨습니다.");
                ourAtk = ourAtk - 10;
                break;
            case 4:
                System.out.println("신발을 구입하셨습니다.");
                break;
        }
        System.out.println("챔피언을 선택해 주세요.");
        System.out.println("챔피언         공격력   체력");
        System.out.println("1.말파이트      200    1700");
        System.out.println("2.람머스        150    2500");
        System.out.println("3.미스포츈      350    1000");
        System.out.println("4.레오나        230    1500");
        int characterNum = scan.nextInt();
        String character = " ";
        String theirCharacter = " ";
        switch (characterNum) {
            case 1:
                character = "말파이트";
                ourAtk = 200;
                ourHp = 1700;
                break;
            case 2:
                character = "람머스";
                ourAtk = 150;
                ourHp = 2500;
                break;
            case 3:
                character = "미스포츈";
                ourAtk = 350;
                ourHp = 1000;
                break;
            case 4:
                character = "레오나";
                ourAtk = 230;
                ourHp = 1500;
                break;
        }

        Random rand1 = new Random();
        int theirNum = rand1.nextInt(4) + 1;


        switch (theirNum) {
            case 1:
                theirCharacter = "말파이트";
                theirAtk = 200;
                theirHp = 1700;
                break;
            case 2:
                theirCharacter = "람머스";
                theirAtk = 150;
                theirHp = 2500;
                break;
            case 3:
                theirCharacter = "미스포츈";
                theirAtk = 350;
                theirHp = 1000;
                break;
            case 4:
                theirCharacter = "레오나";
                theirAtk = 230;
                theirHp = 1500;
                break;
        }

        System.out.print("페이커의 포지션은 ");
        System.out.print(positionName);
        System.out.println("이고 " + character + "를 선택했습니다.\n" +
                "페이커의 기본공격은 " + ourAtk + "입니다.\n" +
                "상대 캐릭터 "+theirCharacter+"의 체력은 "+theirHp+"입니다.\n");

        Random rand2 = new Random();

        int randomNum1 = rand1.nextInt(100);
        int randomNum2 = rand2.nextInt(100);
        int ourRealAtk;
        int theirRealAtk;
        int turn = 0;

        if (randomNum1 <= randomNum2) {
            while (theirHp > 0 && ourHp > 0) {
                if(turn == 3){
                    turn = 0;
                }
                randomNum1 = rand1.nextInt(100);
                randomNum2 = rand2.nextInt(100);
                theirRealAtk = theirAtk - randomNum2;
                ourRealAtk = ourAtk - randomNum1;
                if (turn == 2) {
                    ourRealAtk += 40;
                    theirRealAtk += 100;
                }
                System.out.println("상대 "+theirCharacter+"의 평타!!!");
                if (ourHp <= theirRealAtk) {
                    remainedOurHp = 0;
                } else {
                    remainedOurHp = ourHp - theirRealAtk;
                }
                System.out.println("적이 공격을 시작합니다. 받은 피해량 " + (ourHp - remainedOurHp) + ", " + character + "의 남은체력 " + remainedOurHp);
                ourHp = remainedOurHp;


                System.out.println("1.공격");
                System.out.println("2.아무것도 안하기");
                answer = scan.nextInt();

                if (answer == 1) {
                    if (theirHp <= ourAtk) {
                        remainedTheirHp = 0;
                    } else {
                        remainedTheirHp = theirHp - ourAtk;
                    }
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 " + (theirHp - remainedTheirHp) + ", "+theirCharacter+"의 남은체력 " + remainedTheirHp);
                    theirHp = remainedTheirHp;
                }

            }

        }
        else{
            while (theirHp > 0 && ourHp > 0) {
                if(turn == 3){
                    turn = 0;
                }
                randomNum1 = rand1.nextInt(100);
                randomNum2 = rand2.nextInt(100);
                theirRealAtk = theirAtk - randomNum2;
                ourRealAtk = ourAtk - randomNum1;
                if (turn == 2) {
                    ourRealAtk += 40;
                    theirRealAtk += 100;
                }

                System.out.println("1.공격");
                System.out.println("2.아무것도 안하기");
                answer = scan.nextInt();

                if (answer == 1) {
                    if (theirHp <= ourRealAtk) {
                        remainedTheirHp = 0;
                    } else {
                        remainedTheirHp = theirHp - ourRealAtk;
                    }
                    System.out.println("공격을 시작합니다. 적에게 준 피해량 " + (theirHp - remainedTheirHp) + ", "+theirCharacter+"의 남은체력 " + remainedTheirHp);
                    theirHp = remainedTheirHp;
                }


                System.out.println("상대 "+theirCharacter+"의 평타!!!");
                if (ourHp <= theirRealAtk) {
                    remainedOurHp = 0;
                } else {
                    remainedOurHp = ourHp - theirRealAtk;
                }
                System.out.println("적이 공격을 시작합니다. 받은 피해량 " + (ourHp - remainedOurHp) + ", " + character + "의 남은체력 " + remainedOurHp);
                ourHp = remainedOurHp;


            }

        }
        if(ourHp  == 0){
            System.out.println("상대 "+theirCharacter +" 라인전 승리");
        }
        else{
            System.out.println(character + " 라인전 승리");
        }

    }
}
