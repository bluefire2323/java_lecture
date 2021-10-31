package lecture_20211031;

public class Lecture01 {
    public static class Animal{
        int age;
        double weight;
        String name;
        double height;

        public void printInfo(){
            System.out.println("나이는 : "+this.age +"\n몸무게는 : "
                    +this.weight +"\n이름은 : " + this.name + "\n키는 : "+height);
        }
        //메소드 이름 작성할 때는 보통 동사+명사
        public String printAge(int age){
            return this.age + "살";
        }
    }

    public static void main(String[] args) {
        Animal dog = new Animal ();
        dog.age = 2;
        dog.weight = 30.0;
        dog.name = "바둑이";
        dog.height = 200;

        dog.printInfo();
        System.out.println(dog.printAge(20));

    }
}
