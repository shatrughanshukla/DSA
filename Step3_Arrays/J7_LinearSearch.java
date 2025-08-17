class Solution {
    public int search(int arr[], int x) {
        int t = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                t = i;
                break;
            }
        }
        return t;
    }
}

public class J7_LinearSearch {
    
}
