class Solution {
    public static int largest(int[] arr) {
        int high = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > high){
                high = arr[i];
            }
        }
        return high;
    }
}

public class J1_LargestElementInArray {

    
}