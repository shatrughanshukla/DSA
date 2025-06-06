/*
The Lucky Number Race (For Loop, Nested If-Else) 
Problem Statement: 
In the kingdom of Numerland, the citizens are fascinated by "lucky numbers." A number is called lucky if: 
• It is divisible by 4 or 7. 
• If divisible by both, it is called a "super lucky" number. 
Given two numbers a and b, count how many lucky numbers and super lucky numbers exist between them (inclusive). 
Input: 
Two integers a and b 
Output: 
Print two values: the count of lucky numbers and the count of super lucky numbers. 
Sample Input: 
10.30 
Sample Output 
7 1
*/
import java.util.Scanner;
public class J5_LuckyNumbers {
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try{
            int luckyNum = 0;
            int superLuckyNum = 0;
            int startNum = sc.nextInt();
            int endNum = sc.nextInt();
            for(int i = startNum; i <= endNum; i++)
            {
                if (i % 4 == 0 || i % 7 == 0 ) {
                    luckyNum++;  
                    if (i % 4 == 0 && i % 7 == 0 ) {
                      superLuckyNum++;  
                    }
                }
            }
            System.out.println("Lucky numbers are " + luckyNum + " Super lucky numers are " + superLuckyNum);
        }finally{
            sc.close();
        }
    }
}
