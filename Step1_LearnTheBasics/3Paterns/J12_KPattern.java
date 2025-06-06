import java.util.Scanner;

public class J12_KPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j <= n+1-i; j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i = n-1; i >= 1; i--)
            {
                for(int j = 1; j <= n+1-i; j++)
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
