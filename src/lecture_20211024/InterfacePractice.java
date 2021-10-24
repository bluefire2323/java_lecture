package lecture_20211024;

interface Champion {
    void cry();
    int Stat(int attackstat);
}

class Timo implements Champion{

    @Override
    public void cry() {
        System.out.println("가렌 마이 죽여버릴거야ㅋㅋ");
    }

    @Override
    public int Stat(int attackstat) {
        return attackstat;
    }
}

class Aatrox implements Champion{

    @Override
    public void cry() {
        System.out.println("티 확 찢");
    }

    @Override
    public int Stat(int attackstat) {
        return attackstat;
    }
}

class Ahri implements Champion{

    @Override
    public void cry() {
        System.out.println("아ㅋㅋ 딜 버프좀");
    }

    @Override
    public int Stat(int attackstat) {
        return attackstat;
    }
}

class Annie implements Champion{

    @Override
    public void cry() {
        System.out.println("응애 나 5티어 애니");
    }

    @Override
    public int Stat(int attackstat) {
        return attackstat;
    }
}

public class InterfacePractice {
    public static void main(String[] args) {
        Timo TG = new Timo();
        Aatrox Thal = new Aatrox();
        Ahri Zzomal = new Ahri();
        Annie Mage = new Annie();
        TG.cry();
        Thal.cry();
        Zzomal.cry();
        Mage.cry();
        System.out.println(TG.Stat(50));
        System.out.println(Thal.Stat(80));
        System.out.println(Zzomal.Stat(20));
        System.out.println(Mage.Stat(40));
    }
}
