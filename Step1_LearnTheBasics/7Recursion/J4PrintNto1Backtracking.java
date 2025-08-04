import java.util.Scanner;

class Solution  {
    static void PrinttoN(int i, int b){
        if (i > b) {
            return;
        }
        PrinttoN(i+1, b);
        System.out.println(i);
    }
}
public class J4PrintNto1Backtracking {
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
