import java.util.Scanner;

public class J1CountDigits {
public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            long num = sc.nextLong();
            // int count = 0;
            // while (num > 0) {
            //     count++;
            //     num /= 10; O(log10(n))
            // }
            int count = (int)(Math.log10(num)+1); // optimal approach O(1)
            System.out.println(count);
        }finally{
            sc.close();
        }
    }
} 
/*
Step 2: The count of digits can be calculated using log10 N + 1.

log10 N operation gives the logarithmic base 10 of which returns the power to which 10 must be raised to, to be equal to N.
We add 1 to the result which accounts for the possibility that N itself is a power of 10.
Financially cast the result to an integer to ensure that it is rounded down to the nearest whole number.
*/