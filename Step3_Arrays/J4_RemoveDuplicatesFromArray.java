class Solution {
    public int removeDuplicates(int[] arr) {
       int i = 0;
       for(int j = 0; j < arr.length; j++){
        if(arr[i] != arr[j]){
            arr[i+1] = arr[j];
            i++;
        }
       }
       return i+1;
    }
}
public class J4_RemoveDuplicatesFromArray {
	// Add your code here
}