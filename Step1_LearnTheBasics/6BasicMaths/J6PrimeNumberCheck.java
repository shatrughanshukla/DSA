/*
Prime Number
Difficulty: BasicAccuracy: 22.2%Submissions: 354K+Points: 1
Given a number n, determine whether it is a prime number or not.

A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
Constraints:
1 ≤ n ≤ 109
*/

import java.util.Scanner;

class Solution {
    static boolean isPrime(int n) {
        int count = 0;
        for(int i = 1; i*i <= n; i++){ // // i*i <=n time complexity of root(n) VERY IMP CONCEPT, taught in J5 Question link.
            if(n % i == 0){
                count++;
                if(n/i != 1) // // part for solving Q in root n time complexity.
                {
                    count++;
                }
            }
        }
        
        if(count == 2){
            return true;
        }else return false;
    }
}
public class J6PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int num = sc.nextInt();
            System.out.print(Solution.isPrime(num)); // // stati method should be call in a static way!!
            System.out.println();
        }finally{
            sc.close();
        }
    }
}
