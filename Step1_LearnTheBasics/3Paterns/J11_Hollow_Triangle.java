/*
   *
  * *
 *   *
*******
*/

import java.util.Scanner;

public class J11_Hollow_Triangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n-i; j++)
                {
                    System.out.print(" ");
                }
                for(int k = 1; k <= (2*i)-1; k++)
                {
                    if(i == n || k == 1 || k == 2*i-1)
                    {
                        System.out.print("*");
                    }
                    else
                    System.out.print(" ");
                }
                System.out.println();
            }
        }finally
        {
            sc.close();
        }
    }
}
/*
Before jumping to loops, likh le:

Row no: i

Spaces: n - i

Stars: 2*i - 1

Print condition: if(j == 1 || j == 2*i-1)
 */