/*
*******
*     *
*     *
*     *
*     *
*     *
*******
*/

import java.util.Scanner;

public class J1_SquareHollowPattern {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            for(int i = 0; i <n; i++){
                for(int j = 0; j < n; j++){
                    if(i == 0 || j == 0 || i == n-1 || j == n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
