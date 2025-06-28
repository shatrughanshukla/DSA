/*
All divisors of a Number
Difficulty: EasyAccuracy: 46.73%Submissions: 56K+Points: 2Average Time: 10m
Given an integer N, print all the divisors of N in the ascending order.
 

Example 1:

Input : 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely 
divisible by 1, 2, 4, 5, 10 and 20.

Example 2:

Input: 21191
Output: 1 21191
Explanation: As 21191 is a prime number,
it has only 2 factors(1 and the number itself).

Your Task:

Your task is to complete the function print_divisors() which takes N as input parameter and prints all the factors of N as space seperated integers in sorted order. You don't have to print any new line after printing the desired output. It will be handled in driver code.
 

Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(sqrt(N))
 

Constraints:
1 <= N <= 105
*/

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
      // public static void print_divisors(int n) {
    //     for(int i = 1; i <= n; i++){
    //         if(n % i == 0){
    //             System.out.print(i + " ");
    //         }
    //     }
        
    // }

    public static ArrayList<Integer> print_divisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        // int sqrtN = (int)Math.sqrt(n);
        // for(int i = 1; i <= sqrtN; i++){
        for(int i = 1; i * i <= n; i++){ // // O(root n) time complexity approach ! 
            if (n % i == 0) {
                divisors.add(i);
                if (i != n/i) {
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
}

public class J5Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int num = sc.nextInt();
            System.out.print(Solution.print_divisors(num)); // // stati method should be call in a static way!!
            System.out.println();
        }finally{
            sc.close();
        }
    }
}
/*
https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/ ----> optimal approach, read this !!
*/