import java.util.Scanner;

public class J16_Char_Square {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            char ch = 'a';
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                   System.out.print(ch);
                   ch++;

                }
                
                System.out.println();
            }
        }finally{
            sc.close();
        }
    }
}
// Because ch is declared outside the outer loop — so it's getting incremented across the whole square.
// Each time you do ++ch or ch++.