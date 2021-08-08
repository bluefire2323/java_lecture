package lecture_20210808;

public class Food {
    //멤버(필드,메서드)

    String kind;
    String color;
    int tasteRate;

    Food(){
        this.kind = "몰라요";
        this.color = "색상도 몰라요";
        this.tasteRate = 0;
    }

    //메서드
    Food(String kind){
        this.kind = kind;
    }
    Food(String kind,String color){
        this.kind = kind;
        this.color = color;
    }
    //생성자는 멤버를 초기화시키려고 쓴다.

    public void printInfo(){
        System.out.println("종류는 ??? "+kind);
        System.out.println("색상은 ??? "+color);
        System.out.println("맛 별 개수는 ??? "+tasteRate);
    }

    public int changeTestRate(int tasteRate){
        this.tasteRate = tasteRate;

        return this.tasteRate;
    }

}
