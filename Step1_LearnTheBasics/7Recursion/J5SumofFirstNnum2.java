import java.util.Scanner;

class Solution{
    public static void sumOfNum(int i, int sum){
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNum(i-1, sum+i);
    }
}
public class J5SumofFirstNnum2 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    try{
        int n = sc.nextInt();
        Solution.sumOfNum(n, 0);
    }finally{
        sc.close();
    }
}
}
// parameteric