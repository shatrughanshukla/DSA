// // Write a program that calculates the discount based on the total bill;
// // greater than $500, apply a 20% discount.
// // between $200 n $500, apply a 10% discount.
// // otherwise no discount.
import java.util.Scanner;
public class DiscountonBill {
    public static void main(String[] str)
    {
        Scanner sc = new Scanner(System.in);
        try{
            double bill = sc.nextInt();
            double discount;
            if(bill > 500){
                discount = ((20/100)*bill);
                bill = bill - discount;
                System.out.println(bill + " After 20% Dicount");
            }
            else if(bill <= 500 && bill >= 200){
                discount = ((10/100)*bill);
                bill = bill - discount;
                System.out.println(bill + " After 10% Discount");
            }
            else if(bill < 200){
                System.out.println(bill + " No Discount");
            }
            
        }finally{
            sc.close();
        }
    }
}
// // character.touppercase('a') - > A
// // character.iswhitespace(' ') - > true