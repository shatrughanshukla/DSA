/*

*
**
***
****
***
**
*

*/
import java.util.Scanner;
public class J14_RightPascalTriangle {
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = 2; i <= n; i++)
            {
                for(int j = i; j <= n; j++)
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
