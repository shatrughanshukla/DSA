/*
https://www.geeksforgeeks.org/problems/implement-lower-bound/1

// Iterative Approach;
class Solution {
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
}

// Recursive Approach;
class Solution {
	int lowerBound(int[] arr, int k) {
	int low = 0;
	int n = arr.length;
	int high = arr.length-1;
	return helperLB(arr, low, high, k, n);
}
int helperLB(int[] nums, int low, int high, int target, int length){
    int mid = (low + high)/2;
    if(low > high){
        return Math.min(length, nums.length);
    }
    
    if(nums[mid] >= target){
        length = mid;
        return helperLB(nums, low, mid-1, target, length);
    }
    return helperLB(nums, mid+1, high, target, length);
}

### UPPER BOUND -

https://www.geeksforgeeks.org/problems/implement-upper-bound/1

Similar like LowerBound, just target is not included in this case.

https://leetcode.com/problems/search-insert-position/

uses same principle of LowerBound

https://www.geeksforgeeks.org/problems/ceil-in-a-sorted-array/1

uses same principle of LowerBound

```java
class Solution {
	public int findCeil(int[] arr, int k) {
	// Iterative Approach;
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int index = -1;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] >= k){
			index = mid;
			high = mid-1;
			}
			else low = mid+1;
			}
		return index;
	}
}
```

https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1

uses same principle of LowerBound but with a minor tweak;

```java
class Solution {
	public int findFloor(int[] arr, int k) {
		int n = arr.length;
		int low = 0;
		int high = n-1;
		int index = -1;
		while(low <= high){
			int mid = (low+high)/2;
			if(arr[mid] <= k){
			index = mid;
			low = mid+1;
			}
			else high = mid-1;
		}
		return index;
	}
}
```

https://www.notion.so/2ImplementLower_UpperBound-2fdf51bd6dd18028a619eac94c37d0f9?source=copy_link
*/