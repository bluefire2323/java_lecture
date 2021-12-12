package LOL;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MatchingSystem {
    void matchGame() throws InterruptedException {
        System.out.println("게임을 시작하시겠습니까? 1) 예 2) 아니오");
        Scanner scan = new Scanner(System.in);
        int value;
        value = scan.nextInt();
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        GameSelect game = new GameSelect();
        AddParty party = new AddParty();

        if(value == 1){
            while(true) {
                System.out.println("파티원의 수를 입력해 주세요.");
                value = scan.nextInt();
                game.selectGame();
                TimeUnit.SECONDS.sleep(5);
                int rand = random.nextInt(11);
                if (rand < 3) {
                    System.out.println("...누군가 게임을 취소해 다시 매칭을 시작합니다...");
                    TimeUnit.SECONDS.sleep(4);
                    System.out.println("게임이 매칭되었습니다.");
                    party.partyMatch(value);
                    break;
                } else if (rand < 5) {
                    System.out.println("...우리 팀원이 게임을 취소했습니다...");
                    TimeUnit.SECONDS.sleep(4);
                }
                else{
                    System.out.println("게임이 매칭되었습니다.");
                    party.partyMatch(value);
                    break;
                }
            }

        }
        else{
            System.out.println("매칭을 종료합니다.");
        }
    }
}
