import java.util.Scanner;

class Solution {
    public static int NnumbersSum(int i, int n){
        if(i > n){
            return 0;
        }
        return i + NnumbersSum(i+1, n);
    }
}
public class J5SumofFirstNnum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int z = Solution.NnumbersSum(1, n);
            System.out.println(z);
        }finally{
            sc.close();
        }
    }
}
/*

Nnumberssum(1, 3)
 → 1 + Nnumberssum(2, 3)
     → 2 + Nnumberssum(3, 3)
         → 3 + Nnumberssum(4, 3)
             → returns 0
         → returns 3 + 0 = 3
     → returns 2 + 3 = 5
 → returns 1 + 5 = 6 ✅

*/