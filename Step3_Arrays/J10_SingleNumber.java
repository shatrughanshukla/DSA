// https://leetcode.com/problems/single-number/description/

// Optimal Approach: 

class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int num : nums){
            xor ^= num;
        }
    return xor;
}
/*
Key XOR properties:
    x ^ x = 0 → duplicates cancel out.
    x ^ 0 = x → XOR with zero does nothing.
*/
public class J10_SingleNumber {
}

/*

1. Odd frequency detection

    If a number appears odd number of times, it will survive after XOR.
        Example: [2,2,3,3,4] → all pairs cancel, only 4 remains.
        So whenever you have all elements appear even times except one odd-frequency element, XOR is your hammer.

    2. Finding a missing number

        If numbers are from 0..n and one is missing, you can XOR all indices and all elements.
        The missing one will remain.
        Pattern: one element missing / mismatched → use XOR.

    3. Finding two unique numbers

        If all numbers appear twice except two unique numbers, XOR of the array gives A ^ B.
        Then, you can separate them using a distinguishing bit.
        Pattern: two odd-frequency elements.

    4. Detect parity (odd/even count)

        XOR can help in subset problems. Example: if XOR of all numbers is 0, total parity is even; else odd.
        Useful in game theory (Nim game).

    5. Bitwise manipulation shortcuts

        Swapping two numbers without temp:
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

        Checking if a number is power of 2:
            (n & (n-1)) == 0
            
    6. Combine sets where order doesn’t matter.

*/

        // Brute Force Approach
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     count = 0;
        //     int num = nums[i];
        //     for(int j = 0; j < nums.length; j++){
        //         if(nums[j] == num) count++;
        //     }
        //     if(count == 1){
        //         count = num;
        //         break;
        //     }
        // }
        // return count;

        // Better Approach by using hashing (can hashing be always used, no what if
        // arr = 10^7 then use map<longlong, int>)

        // Using hash but -ve numbers and long numbers not handled. 

        // int maxii = nums[0];
        // for(int i = 0; i < nums.length; i++){
        //     if(maxii < nums[i]){
        //         maxii = nums[i];
        //     }
        // }
        // int[] hash = new int[maxii + 1];
        // for(int i = 0; i < nums.length; i++){
        //     hash[nums[i]]++;
        // }
        // for(int i = 0; i < nums.length; i++){
        //     if(hash[nums[i]] == 1){
        //         maxii = nums[i];
        //         break;
        //     }
        // }
        // return maxii;

        // Using hashMap or TreeMap

        // Map<Integer, Integer> map = new TreeMap<>();
        // for(int num : nums){
        // map.put(num, map.getOrDefault(num, 0)+1);
        // }

        // for(int num : nums){
        //     if(map.get(num) == 1){
        //         return num;
        //     }
        // }
        // return -1;

        /*
        concept for for each: 
        When to use for-each loop (for(int x : arr))

            You only need elements themselves (not their indexes).
            You don’t care about where in the array the element is.
                Example tasks:
                Counting frequency
                Summing all values
                Checking if any element matches a condition
            Think of it like: “I just want every element one by one.”

        */
    }