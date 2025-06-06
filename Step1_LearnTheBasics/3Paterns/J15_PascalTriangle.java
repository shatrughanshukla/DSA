/*

        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1

*/

/*
 * C(i, j) = C(i, j-1).({i - j + 1}/{j})
 * in code j can start from indexing 0 i.e we rearrange this code as 
 * C(i, j+1) = C(i, j).({i - j}/{j+1})
 */
import java.util.Scanner;

public class J15_PascalTriangle {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j <= n-i-1; j++) // // it can be n-i-2 no problem !!
                {
                    System.out.print(" ");
                }

                int num = 1;
                for(int j = 0; j<=i; j++){
                    System.out.print(num + " ");
                    num = num*(i-j)/(j+1);
                }
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
