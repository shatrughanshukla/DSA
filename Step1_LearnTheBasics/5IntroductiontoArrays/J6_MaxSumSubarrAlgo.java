/*Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
*/


// // // // // // // brute force approach. // // // // // // //
// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0;
//         int maxii = nums[0];
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i; j < nums.length; j++){
//                 sum += nums[j];
//                 maxii = Math.max(sum, maxii);
//             }
//             sum = 0;
//         }
//         return maxii;
//     }
// }

// // // // // // // KADANE'S ALGORITHM // // // // // // // 
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxii = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(sum > maxii){
                maxii = sum;
            }
            if(sum < 0)
            {
                
                sum = 0;
            }
        }
        return maxii;
    }
}
public class J6_MaxSumSubarrAlgo {
    public static void main(String[] str){
    int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
    Solution sol = new Solution();
        int result = sol.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is " + result);
    }
}

// // // // //
/*
 * Between these two:  
1️⃣ **Using `maxii = nums[0]`**  
2️⃣ **Using `maxii = Integer.MIN_VALUE`**  

### **Which is better?**
✅ **Using `maxii = nums[0]`** is slightly better for clarity and avoids unnecessary initialization with an extreme value.

### **Why?**
- It **directly initializes** `maxii` with a value from the array, ensuring it's always within the input range.
- It avoids using `Integer.MIN_VALUE`, which is an extreme edge case and isn't needed if we know the array has at least one element.
- It makes debugging and understanding the code easier.

### **When to use `Integer.MIN_VALUE`?**
- If the input is **not guaranteed** to have at least one element (though in this problem, it's guaranteed).
- If you want a **generalized approach** that works even when constraints change.

### **Final Choice**
👍 **Use `maxii = nums[0]` for this specific problem.**  
⚠️ **Use `maxii = Integer.MIN_VALUE` if handling an unknown or edge-case scenario.**
 */