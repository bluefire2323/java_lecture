package lecture_20220522;

public class JavaClassPractice extends ParentClass{
    private int num1;
    private int num2;
    JavaClassPractice(){

    }
    JavaClassPractice(int num1){
        this.num1 = num1;
    }
    JavaClassPractice(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    JavaClassPractice(int superNum1, int superNum2, int num1, int num2){
        super(superNum1, superNum2);
        this.num1 = num1;
        this.num2 = num2;
    }

    int sum(){
        return num1 + num2 + superNum1 + superNum2;
    }

    int sum(int x){
        return num1 + x;
    }

    int sum(int x, int y){
        return x + y;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
