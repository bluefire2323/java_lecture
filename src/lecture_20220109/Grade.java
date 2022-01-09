package lecture_20220109;

public class Grade {
    private int koreanGrade;
    private int englishGrade;
    private int mathGrade;
    Grade(int koreanGrade, int englishGrade,int mathGrade){
        this.koreanGrade = koreanGrade;
        this.englishGrade = englishGrade;
        this.mathGrade = mathGrade;

    }

    public int getKoreanGrade() {
        return koreanGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }
    public char printGetLevel(){
        if(koreanGrade + englishGrade + mathGrade < 210){
            return 'F';
        }
        else{
            return 'A';
        }
    }
}
