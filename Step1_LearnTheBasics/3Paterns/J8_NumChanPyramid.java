import java.util.Scanner;

public class J8_NumChanPyramid {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int k = 1;
            int n = sc.nextInt();
            for(int i = 1; i <= n; i++)
            {
                for(int j = 1; j<= i; j++)
                {
                    System.out.print(k + " ");
                    k++;
                }
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
