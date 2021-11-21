package Blizzard;

public class Starcraft {
    public static void main(String[] args) {
        // 객체 생성
        Marine marine = new Marine("마린", 80);
        Medic medic = new Medic("메딕", 60);
        // 마린 스팀팩 버프~
        marine.stimpack();
        // 메딕의 치료 -> 마린
        medic.heal(marine);
    }
}
