package lecture_20220102;

public class Exam02 {
    static void changeTime(int seconds){
        int hour = 0;
        int minute = 0;
        int second = 0;
        while(seconds >= 3600){
            seconds -= 3600;
            hour++;
        }
        while (seconds >= 60){
            seconds -= 60;
            minute++;
        }
        second = seconds;
        System.out.println(hour + "시간 "+ minute + "분 " + second + "초");
    }
    public static void main(String[] args) {
        changeTime(7852);
    }
}
