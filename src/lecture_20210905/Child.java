package lecture_20210905;

public class Child extends Parent{

    public int childPublicNumber = 4444;
    public int publicNumber = 9999;
    public int number1 = 3333;

    void display(){
        System.out.println(childPublicNumber);
        System.out.println(publicNumber);
        System.out.println(this.number1);
        System.out.println(super.number1);
        System.out.println(this.childPublicNumber);
        System.out.println(number1);
        System.out.println(number2);

    }

    Child() {
        super(1004);
    }



}
