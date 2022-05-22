package java_exam;

import java.util.Scanner;

public class Ade extends Receipt implements Menu {
    private String size;
    private int price;
    private String name;
    private String[] menuInfo = {"톡 쏘는 체리향이 일품인 체리 에이드!","시원한 오렌지가 듬뿍 들어간 오렌지 에이드!",
            "딸기향이 생생하게 살아있는 딸기 에이드!","우리 가게 인기 상품! 자몽 에이드!"};

    public void selectAde(){
        System.out.println("#############################################");
        System.out.println("에이드를 선택하셨습니다.\n");
        System.out.println("에이드의 종류는 아래 4가지 입니다.");
        System.out.println("1.체리 에이드");
        System.out.println("2.오렌지 에이드");
        System.out.println("3.딸기 에이드");
        System.out.println("4.자몽 에이드");
        System.out.println("메뉴의 정보를 확인하려면 메뉴를 입력해주세요.");
        System.out.println("#############################################");
        Scanner scan = new Scanner(System.in);
        String menu = scan.nextLine();
        if(menu.length() == 1){
            if(menu == "1") {
                System.out.println("체리 에이드를 선택하셨습니다.");
                Constant.totalPrice += 5000;
                selectedFood.add("체리 에이드");
            }else if(menu == "2") {
                System.out.println("오렌지 에이드를 선택하셨습니다.");
                Constant.totalPrice += 4000;
                selectedFood.add("오렌지 에이드");
            }else if(menu == "3") {
                System.out.println("딸기 에이드를 선택하셨습니다.");
                Constant.totalPrice += 4500;
                selectedFood.add("딸기 에이드");
            }else{
                System.out.println("자몽 에이드를 선택하셨습니다.");
                Constant.totalPrice += 5500;
                selectedFood.add("자몽 에이드");
            }
            System.out.println("다른 메뉴를 더 추가하시겠습니까?");
            int answer = scan.nextInt();
            switch (answer){
                case 1:
                    break;
                case 2:
                    Order order = new Order();
                    order.setMenu();
            }
        }
    }

    @Override
    public void getMenuInfo(String menu) {

    }

    @Override
    public void getMenuSizeInfo(String menu) {

    }
}
