import java.util.Scanner;
public class IfaNumisOddorEven
{
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            if(n % 2 == 0){
                System.out.println("EVEN");
            }
            else{
                System.out.println("ODD");
            }
            
        }finally{
            sc.close();
        }
    }
}