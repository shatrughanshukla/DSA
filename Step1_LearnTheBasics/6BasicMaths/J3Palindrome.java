/*

9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1

*/
import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int org = x;
        int sum = 0;
        while(x > 0)
        {
            int rem = x % 10;
            sum = (sum * 10) + rem;
            x /= 10;
            rem = 0;
        }
        if(org == sum ){
            return true;
        }else{
            return false;
        }
    }
}

public class J3Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int num = sc.nextInt();
            Solution n = new Solution();
            boolean rev = n.isPalindrome(num);
            System.out.println(rev);
        }finally{
            sc.close();
        }
    }
}
