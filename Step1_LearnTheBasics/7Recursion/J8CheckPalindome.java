import java.util.Scanner;

class Solution {
    int i = 0;
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // // replaceAll
        return helper(s.toCharArray(), 0, s.length()); // // toCharArray
    }
        private boolean helper(char[]arr, int i, int n){ // //using helper fn
        if(i >= n/2){
            return true;
        }
        if(arr[i] != arr[n-i-1]){
            return false;
        }
       return helper(arr, i+1, n);


    }
}
public class J8CheckPalindome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String str = new String();
            str = sc.nextLine();
            Solution obj = new Solution();
            System.out.println(obj.isPalindrome(str));
        }finally{
            sc.close();
        }
    }
}
