/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    * 
*/

import java.util.Scanner;

public class J10_Diamond_Pattern
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                for(int j = i; j < n; j++)
                {
                    System.out.print(" ");
                }
                for(int j = 1; j <= (2*i)-1; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n-1; i >= 1; i--)
            {
                for(int j = 1; j <= n-i; j++)
                {
                    System.out.print(" ");
                }
                for(int j = 1; j <= (2*i)-1; j++)
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
// // I used both i = 1 and i = n aproach in this question.