package Blizzard;

class Marine {
    // 필드
    String name;
    int hp;
    // 생성자
    public Marine(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }
    // 메소드
    public void stimpack() {
        System.out.printf("[%s]의 스팀팩! HP: %d -> ", name, hp);
        hp -= 10;
        System.out.printf("%d\n",hp);
    }
}
