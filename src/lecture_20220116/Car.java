package lecture_20220116;

public class Car {
    // 필드(멤버변수)
    int price; // 접근제한자 public이 생략됨

    private String owner;//접근제한자 private을 이용해 다른 곳에서 참조 불가

    private String maker;//마찬가지

    // 생성자
    public Car() { // 기본생성자

    }

    public Car(int price, String maker, String owner) {//오버로딩으로 생성자 추가
        // 인자가 price, maker, owner을 초기화해주는 생성자.
        this.price = price;
        this.maker = maker;
        this.owner = owner;
    }

    // 메소드
    public String getOwner() {
        return this.owner;//owner의 getter
    }

    public String getMaker() {
        return this.maker;//maker의 getter
    }

    public void setOwner(String owner) {
        this.owner = owner;//owner의 setter
    }

    public void setMaker(String maker) {
        this.maker = maker;//maker의 setter
    }
}
