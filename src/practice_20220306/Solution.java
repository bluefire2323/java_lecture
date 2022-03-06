package practice_20220306;

import java.util.*;

class Solution {
    public boolean zeroExist(long num){
        boolean answer = false;
        while(num >= 10){
            long remainder = num % 10;
            if(remainder == 0){
                answer = true;
            }
            num = num - remainder;
            num = num/10;
        }

        return answer;
    }
    public long solution(long num) {
        // Write code here.
        num++;
        while(zeroExist(num) == true){
            num++;
        }
        long answer = num;
        return answer;
    }

    // The following is main method to output testcase.
    public static void main(String[] args) {
        Solution sol = new Solution();
        long num = 9949999;
        long ret = sol.solution(num);

        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret + " .");
    }
}
