package test_20211107;

public class SalaryMan {
    int salary = 1000000;
    int getAnnualGross(){
        return salary * 17;
    }
    public SalaryMan(){
        salary = 1000000;
    }
    public SalaryMan(int salary){
        this.salary = salary;
    }

}
