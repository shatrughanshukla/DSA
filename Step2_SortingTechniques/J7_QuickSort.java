package DSA.Step2_SortingTechniques;

import java.util.Scanner;

class Solution {
    public void quickSort(int[] arr, int low, int high) {
        if(low < high){
            int I = partition(arr, low, high);
            quickSort(arr, low, I-1);
            quickSort(arr, I+1, high);

        }
        
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j){
            while(arr[i] <= pivot && i <= high -1){
                i++;
            }
            while(arr[j] > pivot && j >= low +1){
                j--;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
}

public class J7_QuickSort {
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
            obj.quickSort(arr, 0, arr.length-1);
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

// D & C algo