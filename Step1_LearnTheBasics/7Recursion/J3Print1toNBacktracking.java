import java.util.Scanner;
class Solution  {
    static void PrinttoNBack(int i, int b){
        if (i < 1) {
            return;
        }
        PrinttoNBack(i-1, b);
        System.out.println(i);
    }
    
}
public class J3Print1toNBacktracking {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            Solution.PrinttoNBack(n, n);
        }finally{
            sc.close();
        }
    }    
}
