/*
A
AB
ABC
ABCD
ABCDE
*/
import java.util.Scanner;

public class J19_AABABCRightTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                char ch = 'A';
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
