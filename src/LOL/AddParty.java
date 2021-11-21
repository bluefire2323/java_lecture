package LOL;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class AddParty {
    void partyMatch(int partyNum){
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        switch (random.nextInt(2)){
            case 0:
                System.out.print("팀 진영은 블루팀입니다.");
                break;
            case 1:
                System.out.print("팀 진영은 레드팀입니다.");
        }
        int position [] = {0,1,2,3,4};

        for (int i = 0 ; i < 5 ; i++){
            System.out.println(position[i]);
        }

    }
}
