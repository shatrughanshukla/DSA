/*

https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int posI = 0;
        int negI = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                arr[posI] = nums[i];
                posI += 2;
            }
            else{
                arr[negI] = nums[i];
                negI += 2;
            }
        }
        return arr;
    }
}

*/

class J18_RearrangeArrayElementBySign {
    
}