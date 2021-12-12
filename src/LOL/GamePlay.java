package LOL;

import java.util.Scanner;

public class GamePlay {
    void LeagueOfLegends(int position){
        System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
        System.out.print("페이커님의 포지션은 ");
        String positionName = " ";
        switch (position){
            case 0:
                System.out.println("탑입니다.");
                positionName = "팁";
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
        int theirAtk = 200;
        System.out.println("시작 아이템을 구입해 주세요.");
        System.out.println("아이템         공격력   가격");
        System.out.println("1.도란의 반지   +1      400");
        System.out.println("2.도란의 검     +5      400");
        System.out.println("3.도란의 방패   -10     450");
        System.out.println("4.신발         +0      300");
        Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();
        int ourHp = 1;
        int theirHp = 700;
        int answer = 0;
        int remainedTheirHp = 0;
        int remainedOurHp = 0;
        switch(item){
            case 1:
                System.out.println("도란의 반지를 구입하셨습니다.");
                ourAtk = ourAtk+1;
                break;
            case 2:
                System.out.println("도란의 검을 구입하셨습니다.");
                ourAtk = ourAtk+5;
                break;
            case 3:
                System.out.println("도란의 방패를 구입하셨습니다.");
                ourAtk = ourAtk-10;
                break;
            case 4:
                System.out.println("신발을 구입하셨습니다.");
                break;
        }
        System.out.println("챔피언을 선택해 주세요.");
        System.out.println("챔피언         공격력   체력");
        System.out.println("1.레넥톤        170    1000");
        System.out.println("2.비에고        330    600");
        System.out.println("3.오른          100    2500");
        System.out.println("4.케이틀린       700    200");
        int characterNum = scan.nextInt();
        String character = " ";
        switch (characterNum){
            case 1:
                character = "레넥톤";
            case 2:
                character = "비에고";
            case 3:
                character = "오른";
            case 4:
                character = "케이틀린";
        }

        System.out.println("페이커의 포지션은 ");
        System.out.println(positionName);
        System.out.println("이고"+character+"를 선택했습니다.\n" +
                "페이커의 기본공격은 "+ourAtk+"입니다.\n" +
                "상대 캐릭터 코르키의 체력은 700입니다.\n");


        while(theirHp>0 && ourHp > 0){
            System.out.println("상대 코르키의 (유일한 딜링수단인) 평타!!!");
            if(theirHp <= ourAtk){
                remainedOurHp = 0;
            }
            else{
                remainedOurHp = ourHp - theirAtk;
            }
            System.out.println("적이 공격을 시작합니다. 받은 피해량 " +ourAtk+ ", "+character+"의 남은체력 " + remainedTheirHp);
            theirHp = remainedTheirHp;


            System.out.println("1.공격");
            System.out.println("2.아무것도 안하기");
            answer = scan.nextInt();

            if(answer == 1){
                if(theirHp <= ourAtk){
                    remainedTheirHp = 0;
                }
                else{
                    remainedTheirHp = theirHp - ourAtk;
                }
                System.out.println("공격을 시작합니다. 적에게 준 피해량 " +ourAtk+ ", 코르키의 남은체력 " + remainedTheirHp);
                theirHp = remainedTheirHp;
            }

        }
        System.out.println("탈론의 체력이 0이 되었습니다.\n승리");

    }
}
