import java.util.Scanner;
public class J2_PrimeorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int count = 0;
            for(int i = 1; i <= n; i++){
                if(n%i==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println("n is a prime numer");
            }
            else{
                System.out.println("n is not a prime number");
            }
        }finally{
            sc.close();
        }
    }
}
