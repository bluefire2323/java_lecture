package lecture_20210926;

public class VarargSample {
    int getMax(int ...nums) {
        int max = 0;
        for(int i = 0; i<nums.length;i++){
            if(i == 0){
                max = nums[0];
            }
            if(max<nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        VarargSample vt = new VarargSample();
        System.out.println("(2, 5, 7, 0, 1) 최댓값:"+vt.getMax(2, 5, 7, 0, 1));
        System.out.println("(100, 54, 1)    최댓값:"+vt.getMax(100,54,1));
        System.out.println("(10)            최댓값:"+vt.getMax(10));
    }
}
