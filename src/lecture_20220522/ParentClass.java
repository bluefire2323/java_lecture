package lecture_20220522;

public class ParentClass {
    int superNum1;
    int superNum2;
    ParentClass(){

    }
    ParentClass(int num1, int num2){
        superNum1 = num1;
        superNum2 = num2;
    }
    int minus() {
        return superNum1 - superNum2;
    }
}
