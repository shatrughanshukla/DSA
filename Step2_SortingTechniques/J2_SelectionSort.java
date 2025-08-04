package DSA.Step2_SortingTechniques;

/*

Given an array of integers nums, sort the array in non-decreasing order using the selection sort algorithm and return the sorted array.
    A sorted array in non-decreasing order is an array where each element is greater than or equal to all previous elements in the array.
        Examples:
            Input: nums = [7, 4, 1, 5, 3]
            Output: [1, 3, 4, 5, 7]
            Explanation: 1 <= 3 <= 4 <= 5 <= 7.
            Thus the array is sorted in non-decreasing order.

            Input: nums = [5, 4, 4, 1, 1]
            Output: [1, 1, 4, 4, 5]
            Explanation: 1 <= 1 <= 4 <= 4 <= 5.
            Thus the array is sorted in non-decreasing order.

            Constraints:
            1 <= nums.length <= 1000
            -104 <= nums[i] <= 104
            nums[i] may contain duplicate values.

 */

import java.util.Scanner;

class Solution {
    public int[] selectionSort(int[] nums) {
        for(int i = 0; i <= nums.length-2; i++){
            int min = i;
            for(int j = i; j <= nums.length - 1; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            // swap
                int temp;
                temp = nums[i];
                nums[i] = nums[min];
                nums[min] = temp;
        }
        return nums;
    }
}

public class J2_SelectionSort {
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
            obj.selectionSort(arr);
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
