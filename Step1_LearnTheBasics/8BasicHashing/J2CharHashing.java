import java.util.Scanner;

public class J2CharHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            String s = new String();
            System.out.println("Enter the String: ");
            s = sc.nextLine();
            // // precompute
            int[] hash = new int[26];     
            for(int i = 0; i < s.length(); i++){
                hash[(int)s.charAt(i) - 'a']++;
            }
            System.out.println("Enter the no of queries to be asked: ");
            int q = sc.nextInt();
            int store = q;
            while (q-- > 0) {
                System.out.println("Enter the query no " + (store - q) + ": ");
                char ch = sc.next().charAt(0);
                // fetch;
                System.out.println(" frequency query is: " + hash[ch - 'a']);
            }
        }finally{
            sc.close();
        }
    }
}
