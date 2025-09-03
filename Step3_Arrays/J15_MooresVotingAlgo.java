/*

Brute Force Approach (By Me):
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int majorElement = -1;
        if(nums.length == 1) return nums[0];
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[j] == nums[i]){
                    count++;
                    if(count >= n/2){
                        majorElement = nums[i];
                        break;
                    }
                }
            }
            count = 0;
        }
        return majorElement;
    }
}
TC: O(n2);
SC: O(1);

Better Approach: By using Hashing
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> storeMap = new TreeMap<>();
        for(int num : nums){
            storeMap.put(num, storeMap.getOrDefault(num, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : storeMap.entrySet()){
            int key = entry.getKey();
            int count = entry.getValue();
            if(count > n/2){
                return key;
            }
        }
        return -1;
    }
}
TC: O(nlogn)
SC: O(n)

Optimal Approach: 
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int count = 0;
        int el = -1;
        for(int i = 0; i < n; i++){
            if(count == 0){
                count = 1;
                el = nums[i];
            }
            else if(nums[i] == el){
                count++;
            }
            else{
                count--;
            }
        }
        int count1 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == el){
                count1++;
            }
            if(el > n/2){
                return el;
            }
        }
        return el;
    }
}
TC: O(n);
SC: O(1);

*/

public class J15_MooresVotingAlgo {
		// Your code logic here
}