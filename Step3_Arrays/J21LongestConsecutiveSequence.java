/*

Brute Force Approach:
class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 1;
        int maxii = 1;
        int n = nums.length;
        if(n == 0) return 0;
            // for(int i = 0; i < n; i++){
            //     for(int j = i; j < n; j++){
            //         if(nums[j] < nums[i]){
            //             int temp = nums[i];
            //             nums[i] = nums[j];
            //             nums[j] = temp;
            //         }
            //     }
            // }

            Arrays.sort(nums);

        for(int i = 0; i < n-1; i++){
            if(nums[i] == nums[i+1]) continue;
            if(nums[i+1] - nums[i] == 1){
                count++;
            }
            else count = 1;

            maxii = Math.max(maxii, count);
        }
        return maxii;
    }
}

*/