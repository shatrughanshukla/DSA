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
// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // using Hashing.
        int n = arr.length;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            long rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}
*/

/*
Optimal Approach using two pointer and greedy for positives and zeroes:
class Solution {
    public int longestSubarray(int[] arr, int k) {
        // Using Two Pointers (Sliding Window) - works only for positives & zeroes
        int n = arr.length;
        int left = 0, right = 0;
        long sum = arr[0];
        int maxLen = 0;

        while (right < n) {
            // Shrink window from left if sum exceeds k
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }

            // If sum equals k, update max length
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Expand window to right
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        return maxLen;
    }
}

*/
public class J12_longestSubArraywithKSumPositive {
    
}
