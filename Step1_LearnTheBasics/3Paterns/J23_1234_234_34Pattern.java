/*

123456
 23456
  3456
   456
    56
     6
*/

import java.util.Scanner;

public class J23_1234_234_34Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                int num = i;
                for(int j = 1; j <= i-1; j++)
                {
                    System.out.print(" ");
                 }
                for(int j = 1; j <= n-i+1; j++)
                {
                    System.out.print(num);
                    num++;
                }
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
    
}
// // Booyahhh!!!