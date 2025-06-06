/*
E
DE
CDE
BCDE
ABCDE
*/

import java.util.Scanner;

public class J21_EDECDE_Triangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int num = 69;
            for(int i = 1; i <= n; i++)
            {
                char ch = (char)num;
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(ch);
                        ch++;
                }   
                num = num-1;
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }    
}
// // Bravo!!!