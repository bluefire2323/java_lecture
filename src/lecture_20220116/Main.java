package lecture_20220116;

public class Main {
    public static void main(String[] args) {

        Car a7 = new Car();//Car타입의 객체 a7 생성
        a7.setMaker("아우디");//a7의 maker 초기화
        a7.setOwner("서동욱");//a7의 owner 초기화
        a7.price = 100000000;//a7의 price 초기화

        String a7Owner = a7.getOwner();//a7Owner을 a7 객체의 owner로 초기화
        System.out.println(a7Owner);//a7Owner 출력

        Car tt = new Car(600000000, "audi", "송채은");//Car타입의 객체 tt 생성 및 초기화
        int ttPrice = tt.price; //ttPrice를 tt 객체의 price로 초기화
        String ttOwner = tt.getOwner(); //ttOwner를 tt 객체의 owner로 초기화
        String ttMaker = tt.getMaker(); //ttMaker를 tt 객체의 maker로 초기화

        System.out.println(ttPrice); //ttPrice 출력
        System.out.println(ttOwner); //ttOwner 출력
        System.out.println(ttMaker); //ttMaker 출력

    }
}
