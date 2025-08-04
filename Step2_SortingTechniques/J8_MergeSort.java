package DSA.Step2_SortingTechniques;

import java.util.ArrayList;
// import java.util.Scanner;
class Solution {

    void mergeSort(int arr[], int low, int high) {
        if(low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    
    void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp  = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}

public class J8_MergeSort{
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     try{
    //         System.out.println("Enter the length of the array: ");
    //         int n = sc.nextInt();
    //         int[] arr = new int[n];
    //         System.out.println("Enter Array: ");
    //         for(int i = 0; i < n; i++){
    //             arr[i] = sc.nextInt();
    //         }
    //         Solution obj = new Solution();
    //         System.out.println("Unsorted Array");
    //         for(int i = 0; i < n; i++){
    //             System.out.print(arr[i]);
    //             System.out.println();
    //         }
    //         //  obj.mergeSort(arr);
    //         System.out.println("Sorted Array: ");
    //         for(int i = 0; i < n; i++){
    //             System.out.print(arr[i]);
    //             System.out.println();
    //         }
    //     }finally{
    //         sc.close();
    //     }
    // }
}