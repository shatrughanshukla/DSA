package DSA.Step2_SortingTechniques;

/*

Given an array of integers called nums,sort the array in non-decreasing order using the bubble sort algorithm and return the sorted array.
    A sorted array in non-decreasing order is an array where each element is greater than or equal to all preceding elements in the array.
        Examples:
            Input: nums = [7, 4, 1, 5, 3]
            Output: [1, 3, 4, 5, 7]
            Explanation: 1 <= 3 <= 4 <= 5 <= 7.
            Thus the array is sorted in non-decreasing order.

            Input: nums = [5, 4, 4, 1, 1]
            Output: [1, 1, 4, 4, 5]
            Explanation: 1 <= 1 <= 4 <= 4 <= 5.
            Thus the array is sorted in non-decreasing order.

*/
import java.util.Scanner;
class Solution {
    public int[] bubbleSort(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--){
            int didSwap = 0;
            for(int j = 0; j < i; j++){
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
        return nums;
    }
}

public class J2_BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the length of the array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter Array: ");
            for(int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Solution obj = new Solution();
            System.out.println("Unsorted Array");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i]);
                System.out.println();
            }
            obj.bubbleSort(arr);
            System.out.println("Sorted Array: ");
            for(int i = 0; i < n; i++){
                System.out.print(arr[i]);
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
// worst and average can be O(n^2) and the best is O(n).