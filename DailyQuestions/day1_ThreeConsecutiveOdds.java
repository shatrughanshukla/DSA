package DSA.DailyQuestions;
// https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2025-08-21

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                count++;
                if(count == 3){
                    break;
                }
            }else count = 0;
        }
        if(count == 3) return true;
        else return false;
    }
}

public class day1_ThreeConsecutiveOdds {
    
}
