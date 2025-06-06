/*

*      *
**    **
***  ***
********
********
***  ***
**    **
*      * 

*/

import java.util.Scanner;

public class J13_ButterflyPattern {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    try
    {
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        for(int i = 1; i<= n/2; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= n-(2*i); j++)  // // for (int j = 1; j <= 2 * (n - i); j++) when n/2 -> n
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        for(int i = n/2; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            for(int j = 1; j <= n-(2*i); j++)
            {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       
    }finally{
        sc.close();
    }
  }  
}
// // prints butterfly for only even and half of the real value.