/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
 

Constraints:

n == nums.length
1 <= n <= 300
nums[i] is either 0, 1, or 2.
 */

// // // // // // BRUTE FORCE APPROACH // // // // // //
//  class Solution2 {
//     public void sortColors(int[] nums) {
//         int c0 = 0;
//         int c1 = 0;
//         int c2 = 0;
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 0){
//                 c0++;
//             }
//             if(nums[i] == 1){
//                 c1++;
//             }
//             if(nums[i] == 2){
//                 c2++;
//             }
//         }
//         for(int i = 0; i < c0; i++){
//             nums[i] = 0;
//         }
//         for(int i = c0; i < c0 + c1; i++){
//             nums[i] = 1;
//         }
//         for(int i = c0 + c1; i < nums.length; i++){
//             nums[i] = 2;
//         }
//     }
// }

// // // // // // // // // Dutch National Flag Algorithm // // // // // // // // //
class Solution2 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
public class J7_SortColors {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] nums = {2, 0, 2, 1, 1, 0};
        
        System.out.println("Before Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        solution.sortColors(nums);
        
        System.out.println("\nAfter Sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
// // // If for loop is not nested then during calculating complexity it add's not multiplies.