import java.util.Scanner;
public class J3_ReversetheNumber {
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int num = sc.nextInt();
            int sum = 0;
            int rem;
            while (num > 0) {
                rem = num % 10;
                sum = (sum * 10) + rem;
                num = num/10;
            }
            System.out.println("The revesed number is " + sum);
        }finally{
            sc.close();
        }
    }
}
