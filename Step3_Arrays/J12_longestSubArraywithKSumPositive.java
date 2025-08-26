/*

Brute Force Approach:
    Generate all the subarrays and find the longest one.
    Time Complexity: O(n3)
    Space Complexity: O(1)

Better Brute Force Approach(mine):
    fixes a starting index and extends the subarray while incrementally updating the sum, checking if it equals k.

    class Solution {
        public int longestSubarray(int[] arr, int k) {
            int n = arr.length;
            int freq = 0;
            for(int i = 0; i < n; i++){
                int count = 0;
                int sum = 0;
                for(int j = i; j < n; j++){
                    sum += arr[j];
                        count++;
                        if(sum == k){
                            if(count > freq){
                                freq = count;
                            }
                        }
                }
            }
            return freq;
        }
    }
        Time limit exceeded after 1010th case.
        Time Complexity - O(n2)
        Space Complexity - O(1)
 
Better Approach(Using Hashing)


*/

public class J12_longestSubArraywithKSumPositive {
    
}
