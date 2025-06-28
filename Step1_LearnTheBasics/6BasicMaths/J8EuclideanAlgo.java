/*
GCD(a, b) == GCD(a-b, b), where a > b.
*/

import java.util.Scanner;

class Solution{
    public static int gcd(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
   } 
public class J8EuclideanAlgo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int hcf = Solution.gcd(a, b);
            System.out.print("The gcd of a and b is: ");
            System.out.println(hcf);
        }finally{
            sc.close();
        }
    }
}
