import java.util.Scanner;
public class J1_Factorial {
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int fact = 1;
            for(int i = 1; i<= n; i++){
                fact = fact*i;
            }
            System.out.println(fact);
        }finally{
            sc.close();
        }
    }
}
