// https://leetcode.com/problems/max-consecutive-ones/description/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max1 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
                max1 = Math.max(max1, count);
            }else{
                count = 0;
            }
        }
        return max1;
    }
}

public class J9_MaxConsecutive1 {
    
}
