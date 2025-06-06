/*
A
BB
CCC
DDDD
EEEEE 
*/

import java.util.Scanner;

public class J18_ABBCCCRightTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            char ch = 'A';
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(ch);
                }
                    ch++;
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
