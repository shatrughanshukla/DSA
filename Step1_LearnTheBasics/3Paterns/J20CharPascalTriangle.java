import java.util.Scanner;

public class J20CharPascalTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j <= n-i-1; j++)
                {
                    System.out.print(" ");
                }
                int num = 1;
                for(int j = 0; j <= i; j++)
                {
                    char ch = (char)(num + 64);
                    System.out.print(ch + " ");
                    num = num * (i-j)/(j+1);
                }
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }    
}
// Niceee!!!