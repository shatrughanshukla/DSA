import java.util.Scanner;

class Solution  {
    static void PrinttoN(int i, int b){
        if (i > b) {
            return;
        }
        System.out.println(i);
        PrinttoN(i+1, b);
    }
    
}
public class J1Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            Solution.PrinttoN(1, n);
        }finally{
            sc.close();
        }
    }
}
