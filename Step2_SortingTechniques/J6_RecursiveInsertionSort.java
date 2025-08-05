package DSA.Step2_SortingTechniques;
import java.util.Scanner;

class Solution {
    public void insertionSort(int[] nums) {
        int i = 1;
        int n = nums.length;
        helper(nums, i, n);
    }
    private void helper(int[] nums, int i, int n){
        if (i == n) return;
        int j = i;
        while( j > 0 && nums[j] < nums[j-1]){
            int temp = nums[j-1];
            nums[j-1] = nums[j];
            nums[j] = temp;
            j--;
        }
        helper(nums, i+1, n);
    }
}

public class J6_RecursiveInsertionSort {
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
            obj.insertionSort(arr);
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
