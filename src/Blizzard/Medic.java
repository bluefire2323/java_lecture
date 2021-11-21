package Blizzard;

// 메딕 클래스
class Medic {
    // 필드
    String name;
    int hp;

    // 생성자
    public Medic(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    // 메소드
    public void heal(Marine target) {
        System.out.printf("[%s]의 치유! %s HP(%d -> ", name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d)\n", target.hp);
    }
}
