import java.util.Scanner;

class Solution  {
    static void PrinttoN(int i, int b){
        if (i < 1) {
            return;
        }
        System.out.println(i);
        PrinttoN(i-1, b);
    }
}
public class J2PrintNto1 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            Solution.PrinttoN(n, n);
        }finally{
            sc.close();
        }
    }
}
