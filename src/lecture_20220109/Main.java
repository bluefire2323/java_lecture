package lecture_20220109;

public class Main {
    public static void main(String[] args) {
        Students Tommy = new Students("Tommy",19,"병아리반");
        Students Kim = new Students("김태균",41,"회사");

        Grade gradeOfTommy = new Grade(100,90,90);
        Grade gradeOfKim = new Grade(50,50,50);

        System.out.println(Tommy.getName() + "의 나이는 "+Tommy.getAge() + "세, "+Tommy.getDepartment());
        System.out.print("힌국어 " + gradeOfTommy.getKoreanGrade() + "점, ");
        System.out.print("영어 " + gradeOfTommy.getEnglishGrade() + "점, ");
        System.out.print("수학 " + gradeOfTommy.getMathGrade() + "점, ");
        System.out.print("레벨은 " + gradeOfTommy.printGetLevel() + "입니다.");

    }
}
