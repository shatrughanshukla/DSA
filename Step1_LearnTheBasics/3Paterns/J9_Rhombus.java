import java.util.Scanner;

public class J9_Rhombus {
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
                for(int j = 1; j <= n; j++)
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
