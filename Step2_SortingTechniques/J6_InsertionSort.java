package DSA.Step2_SortingTechniques;

import java.util.Scanner;

/*

Given an array arr[] of positive integers.The task is to complete the insertsort() function which is used to implement Insertion Sort.

    Examples:

        Input: arr[] = [4, 1, 3, 9, 7]
        Output: [1, 3, 4, 7, 9]
        Explanation: The sorted array will be [1, 3, 4, 7, 9].

        Input: arr[] = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
        Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        Explanation: The sorted array will be [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].

        Input: arr[] = [4, 1, 9]
        Output: [1, 4, 9]
        Explanation: The sorted array will be [1, 4, 9].

    Constraints:
    1 ≤ arr.size() ≤ 1000
    1 ≤ arr[i] ≤ 1000

*/

class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        for(int i = 0; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        
    }
}

public class J6_InsertionSort {
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
