package LOL;

import java.util.*;

public class AddParty {
    void partyMatch(int partyNum){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        switch (random.nextInt(2)){
            case 0:
                System.out.println("팀 진영은 블루팀입니다.");
                break;
            case 1:
                System.out.println("팀 진영은 레드팀입니다.");
                break;
        }
        int position [] = {0,1,2,3,4};
        int randomPosition [] = new int[5];
        for(int i = 4 ; i >= 0 ; i--){
            int r = random.nextInt(i+1);
            randomPosition[4-i] = position[r];
            for(int j = r;j<i;j++){
                int t = position[j];
                position[j] = position[j+1];
                position[j+1] = t;
            }
        }
        switch (randomPosition[0]){
            case 0:
                System.out.println("페이커님의 포지션은 탑입니다.");
                break;
            case 1:
                System.out.println("페이커님의 포지션은 미드입니다.");
                break;
            case 2:
                System.out.println("페이커님의 포지션은 정글입니다.");
                break;
            case 3:
                System.out.println("페이커님의 포지션은 서폿입니다.");
                break;
            case 4:
                System.out.println("페이커님의 포지션은 원딜입니다.");
                break;
        }
        for(int i = 0 ; i < partyNum - 1 ; i++){
            System.out.print("파티원" + (i+1) + "님의 포지션은 ");
            switch (randomPosition[i+1]){
                case 0:
                    System.out.println("탑입니다.");
                    break;
                case 1:
                    System.out.println("미드입니다.");
                    break;
                case 2:
                    System.out.println("정글입니다.");
                    break;
                case 3:
                    System.out.println("서폿입니다.");
                    break;
                case 4:
                    System.out.println("원딜입니다.");
                    break;
            }
        }
        for(int i = partyNum ; i < 5 ; i++){
            System.out.print("외부인" + (i - partyNum + 1) + "님의 포지션은 ");
            switch (randomPosition[i]){
                case 0:
                    System.out.println("탑입니다.");
                    break;
                case 1:
                    System.out.println("미드입니다.");
                    break;
                case 2:
                    System.out.println("정글입니다.");
                    break;
                case 3:
                    System.out.println("서폿입니다.");
                    break;
                case 4:
                    System.out.println("원딜입니다.");
                    break;
            }
        }
        GamePlay player = new GamePlay();
        player.LeagueOfLegends(randomPosition[0]);


    }
}
