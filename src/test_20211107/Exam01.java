package test_20211107;

public class Exam01 {
    public static class Student{
        String Department;
        int SI;
    }

    public static void main(String[] args) {
        Student YH = new Student();
        YH.Department = "중2병학과";
        YH.SI = 25;
        System.out.println(YH.Department + YH.SI);

    }
}
