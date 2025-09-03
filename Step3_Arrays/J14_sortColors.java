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

    Brute Force Approach II:
    class Solution {
        public void sortColors(int[] nums) {
            int n = nums.length;
            int i = 0;
            int j = n - 1;

            while (i < n) {
                // reset j for every i
                j = n - 1;

                while (j > i) {
                    if (nums[i] > nums[j]) {
                        swap(nums, i, j);
                    }
                    j--;
                }
                i++;
            }
        }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


    Optimal Approach: 

    class Solution {
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
TC: O(n);
SC: O(1);
*/
public class J14_sortColors {
    
}
