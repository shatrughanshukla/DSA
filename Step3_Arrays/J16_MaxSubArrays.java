/*

Brute Force Approach:
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int store = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
        int count = 0;
            for(int j = i; j < n; j++){
                count += nums[j];
                if(count > store){
                    store = count;
                }
            }
        }
        return store;
    }
}
TC: O(n2);
SC: O(1);

Optimal Approach:
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxii = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            maxii = Math.max(sum, maxii);
            if(sum < 0) sum = 0;
        }
        return maxii;
    }
}
TC:(n);
SC:(1;
*/

public class J16_MaxSubArrays {
	// Add your code here
}