/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

By lowerUpperBound;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int lb = lowerBound(nums, target);
        if(lb == n || nums[lb] != target) return new int[]{-1, -1};
        return new int[]{lb, upperBound(nums, target)-1};
    }
    int lowerBound(int[] arr, int k) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int index = n;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] >= k){
				index = Math.min(index, mid);
				high = mid-1;
			}
			else if(arr[mid] < k){
				low = mid+1;
				}
			}
		return index;
	}
    int upperBound(int[] arr, int k) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int index = n;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] > k){
				index = Math.min(index, mid);
				high = mid-1;
			}
			else if(arr[mid] <= k){
				low = mid+1;
				}
			}
			return index;
	}
}

By Plain BS;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOcc(nums, target);
        if(first == -1) return new int[]{-1, -1};
        return new int[]{first, lastOcc(nums, target)};
    }
    int firstOcc(int[] nums, int target){
        int n = nums.length;
        int first = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                first = mid;
                high = mid-1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return first;
    }
    int lastOcc(int[] nums, int target){
        int n = nums.length;
        int last = -1;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(nums[mid] < target){
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return last;
    }
}

https://www.notion.so/3First_LastPosition-2fef51bd6dd1800a914fda73815ace57?source=copy_link
*/