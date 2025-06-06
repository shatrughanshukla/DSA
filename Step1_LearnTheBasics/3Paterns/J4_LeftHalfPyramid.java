// import java.util.Scanner;

// public class J4_LeftHalfPyramid {
//     public static void main(String[] args)
//     {
//        Scanner sc = new Scanner(System.in);
//         try
//         {
//             System.out.print("Enter the value of n: ");
//             int n = sc.nextInt();
//             for(int i = 0; i < n; i++){
//                 for(int j= 0; j < n-i-1; j++){
//                     System.out.print(" ");
//                 }
//                 for(int j = 0; j<=i; j++)
//                 {
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }
//         }finally{
//             sc.close();
//         } 
//     }
// }
import java.util.Scanner;

public class J4_LeftHalfPyramid {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
        try
        {
            System.out.print("Enter the value of n: ");
            int n = sc.nextInt();
            for(int i = n-1; i >= 0; i--){
                for(int j= 0; j < i; j++){
                    System.out.print(" ");
                }
                for(int j = 0; j < n-i; j++)
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
/* 
* sbse phle i, then spaces then j !! 
*/