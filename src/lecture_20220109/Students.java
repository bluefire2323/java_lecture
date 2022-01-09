package lecture_20220109;

public class Students {
    private String name;
    private int age;
    private String department;

    Students(String name, int age, String department){
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}
