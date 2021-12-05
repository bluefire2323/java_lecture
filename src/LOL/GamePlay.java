package LOL;

public class GamePlay {
    void LeagueOfLegends(int position){
        System.out.println("소환사의 협곡에 오신 것을 환영합니다.");
        System.out.println("페이커님의 포지션은 ");
        switch (position){
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
        System.out.println("시작 아이템을 구입해 주세요.");
        System.out.println("아이템       공격력   가격");
        System.out.println("도란의 반지   +1      400");
        System.out.println("도란의 반지   +1      400");
        System.out.println("도란의 반지   +1      400");
        System.out.println("도란의 반지   +1      400");

    }
}
