// https://leetcode.com/problems/subarray-sum-equals-k/
import java.util.HashMap;
import java.util.Map;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int prefixSum = sum - k;
            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
// https://www.notion.so/25SubarraySumEqualsK-2e5f51bd6dd1802daf9de602dec31d58?source=copy_link