import java.util.Scanner;

public class J3_RightHalfPyramid {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            for(int i = n-1; i >= 0; i--){
                for(int j = i; j < n; j++){
                   System.out.print("*");
                }
                System.out.println();
            }
        }finally{
            sc.close();
        } 
    }
}
