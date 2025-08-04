import java.util.Scanner;

class Solution{
public static int sumofNums(int n){
    if(n == 0){
        return 0;
    }
    return n + sumofNums(n-1);
    }
}
public class J5SumofFirstNnum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            System.out.println(Solution.sumofNums(n));
        }finally{ 
            sc.close();
        }
    }
}
