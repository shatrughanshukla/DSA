import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int year = sc.nextInt();
            if(year % 4 == 0)
            {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }finally{
            sc.close();
        }
    }
}
