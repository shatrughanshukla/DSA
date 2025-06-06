import java.util.Scanner;

public class J5_ReverseLeftPyramid {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                for(int j = i; j < n; j++)
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
