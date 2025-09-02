// https://leetcode.com/problems/sort-colors/description/

/*

    Brute force ApproachL:

    import java.util.*;

    class Solution {
        public void sortColors(int[] nums) {
            // Step 1: Store frequency of elements in TreeMap
            TreeMap<Integer, Integer> freqMap = new TreeMap<>();
            for (int num : nums) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            }

            // Step 2: Create ArrayList and add elements in sorted order
            ArrayList<Integer> sortedList = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                int key = entry.getKey();
                int count = entry.getValue();
                for (int i = 0; i < count; i++) {
                    sortedList.add(key);
                }
            }

            // Step 3: Copy back to array
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sortedList.get(i);
            }

            // Print result (just for checking locally)
            // System.out.println(Arrays.toString(nums));
        }
    }

*/
public class J14_sortColors {
    
}
