/*
1. The Magical Forest (Loop and Conditional Statements) 
Problem Statement: 
There is a magical forest where each tree grows based on a unique pattern. A wizard, Merlin, tells you that the height of each tree in the forest on day n follows these rules: 
If n is even, the tree doubles in height. 
If n is odd, the tree grows by 1 meter. 
Starting from a height of 1 meter on day 1, write a program to calculate the height of the tree after t days. 
Input: 
An integer t representing the number of days. 
Output: 
The height of the tree after t days. 
Sample Input: 
5 
Sample Output: 
11
 */
import java.util.Scanner;
public class J4_MagicalFoerst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int t = sc.nextInt();
            int height = 1;
            for(int day = 1; day <= t; day++){
                if(day%2 == 0){
                    height = height*2;
                }
                else{
                    height = height+1;
                }
            }System.out.println(height);
        }finally{
            sc.close();
        }
    }
}
