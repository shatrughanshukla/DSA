/*
A dragon guards a treasure of gold coins. Each time you ask for a coin, the dragon asks you a riddle. If you answer correctly, the dragon gives you a coin. You can ask the dragon for coins t times. However, there's a rule: 
If the number of attempts is divisible by 3, the dragon gives you 2 coins instead of 1. 
If the number of attempts is divisible by 5, the dragon takes away 1 coin (but never below 0). 
Write a program to calculate how many coins you will have after t attempts. 
Input: 
An integer t representing the number of attempts. 
Output: 
The total number of coins after t attempts
*/
import java.util.Scanner;
public class J6_GuardDragaon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int coin = 0;
            int t = sc.nextInt();
            for(int i = 1; i <= t; i++)
            {
                if (i % 3 == 0 && i % 5 == 0) {
                    coin += 2;
                    if (coin > 0 ) {
                        coin--;
                    }
                }
                else if (i % 3 == 0) {
                    coin += 2;
                }
                else if (i % 5 == 0) {
                        if(coin > 0){
                            coin--;
                        }
                    }
                else{
                    coin++;
                    }
            }
            System.out.println("The number of coins after " + t + " riddles are " + coin);
        }
        finally{
            sc.close();
        }
    }
}
