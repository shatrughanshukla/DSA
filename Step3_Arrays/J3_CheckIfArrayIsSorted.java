class Solution {
    public boolean check(int[] nums) {
        boolean bool;
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            count++;
        }
        if(count <= 1) bool = true;
        else bool = false;
        return bool;
    }
}
public class J3_CheckIfArrayIsSorted {
    
}
