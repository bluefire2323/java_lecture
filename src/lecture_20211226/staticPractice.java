package lecture_20211226;

public class staticPractice {
    static int NasusStack = 0;
    void EatLittleMinion () {
        NasusStack += 3;
    }
    void EatBigMinion () {
        NasusStack += 9;
    }
    void Ddokbaegee(){
        System.out.println("나서스의 뚝배기 내리치기!!!");
        System.out.println("대미지 : "+NasusStack);
    }
    public static void main(String[] args) {
        staticPractice Nasus1 = new staticPractice();
        staticPractice Nasus2 = new staticPractice();
        Nasus1.EatBigMinion();
        Nasus2.EatLittleMinion();
        Nasus1.Ddokbaegee();
    }
}
