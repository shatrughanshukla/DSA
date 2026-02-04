/*
https://leetcode.com/problems/binary-search/
https://www.notion.so/1BinarySearch-2faf51bd6dd1808a9946e35890c8e57c?source=copy_link

BruteForce Method:
    class Solution {
	public int search(int[] nums, int target) {
		int index = -1;
		int n = nums.length;
		for(int i = 0; i < n; i++){
			if(nums[i] == target){
			index = i;
			}
		}
		return index;
	}
}

Iterative Approach:
    class Solution {
    public int search(int[] nums, int target) {
        int index = -1;
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target > nums[mid]){
                low = mid+1;
            }
            else if(target < nums[mid]){
                high = mid-1;
            }
            else if(target == nums[mid]){
                index = mid;
                break;
            }
        }
        return index;
    }
}

Recursive Aprroach:
    class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        return bSearch(nums, low, high, target);
    }
    private int bSearch(int[] arr, int low, int high, int target){
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2;
        if(arr[mid] == target) return mid;
        else if(arr[mid] < target){
           return bSearch(arr, mid+1, high, target);
        }
        return bSearch(arr, low, mid-1, target);
    }
}

*/