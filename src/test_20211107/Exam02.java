package test_20211107;
class Student{
    private String Department;
    private int SI;

    public void setDepartment(String department) {
        Department = department;
    }

    public void setSI(int SI) {
        this.SI = SI;
    }

    public String getDepartment() {
        return Department;
    }

    public int getSI() {
        return SI;
    }
}
public class Exam02 {
    public static void main(String[] args) {
        Student YH = new Student();
        YH.setDepartment("핵폭탄학과");
        YH.setSI(25);
        System.out.println(YH.getDepartment() + YH.getSI());

    }
}