package DSA.Step2_SortingTechniques;

import java.util.Scanner;

class Solution {
    public int[] bubbleSortRecursive(int[] nums) {
        int n = nums.length;
        helper(nums, n);
        return nums;
    }
    private void helper(int[] nums, int n){
        if(n == 1) return;
        for(int j = 0; j <= n-2; j++){
            if (nums[j+1] < nums[j]) {
                int temp = nums[j+1];
                nums[j+1] = nums[j];
                nums[j] = temp;
            }
        }
    helper(nums, n-1);
    }
}

public class J5_BubbleSortRecursion {
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
            obj.bubbleSortRecursive(arr);
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
