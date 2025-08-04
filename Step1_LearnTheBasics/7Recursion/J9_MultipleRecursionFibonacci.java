import java.util.Scanner;

class Solution {
    public int fib(int n) {
        if(n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
public class J9_MultipleRecursionFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            Solution fib = new Solution();
            System.out.println(fib.fib(n));
        }finally{
            sc.close();
        }
    }
}
