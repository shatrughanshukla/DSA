import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Solution {
    public static int GCD(int n1, int n2) {
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
        for(int i = 1; i * i <= n1; i++)
        {
            if(n1 % i == 0){
                num1.add(i);
                if(i != n1/i){
                    num1.add(n1/i);
                }
            }
        }
        for(int j = 1; j * j <= n2; j++)
        {
            if(n2 % j == 0){
                num2.add(j);
                if(j != n2/j){
                    num2.add(n2/j);
                }
            }
        }
        for(int i : num1){
            if (num2.contains(i)) {
                num3.add(i);
            }
        }
        int val = Collections.max(num3);
        return val;
    }
}
public class J7GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println(Solution.GCD(n1, n2));
        }finally{
            sc.close();
        }
    }
}
/*

if (num1.get(k) / num2.get(k) == 1)  // ❌ Wrong way to check equality
Yeh index-wise match kar raha hai, lekin divisors unordered ho sakte hain.
Aur index-wise match karna galat logic hai.

✅ Fix using set-like logic:
for (int i : num1) {
    if (num2.contains(i)) {
        num3.add(i);
    }
}

*/