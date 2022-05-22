package lecture_20220522;

public class ObjectCreating {
    public static void main(String[] args) {
        JavaClassPractice YH = new JavaClassPractice();
        YH.setNum1(1);
        YH.setNum2(2);
        System.out.println(YH.getNum1() +" " +YH.getNum2() +" "+ YH.sum());


        JavaClassPractice TG = new JavaClassPractice(5);
        TG.setNum2(2);
        System.out.println(TG.getNum1() +" " +TG.getNum2() +" "+ TG.sum(5));


        JavaClassPractice SC = new JavaClassPractice(5,6);
        System.out.println(SC.getNum1() +" " +SC.getNum2() +" "+ SC.sum(6,7));

        JavaClassPractice Sue = new JavaClassPractice(5,6,7,8);
        System.out.println(Sue.superNum1 +" " +Sue.superNum2 +" " + Sue.getNum1() +" " +Sue.getNum2() +" "+ Sue.sum());
    }
}
