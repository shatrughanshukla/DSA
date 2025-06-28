import java.util.Scanner;

public class J1IntroductiuonToHashing4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the length of arr: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                System.out.println("Enter the " + i + "th index: ");
                arr[i] = sc.nextInt();
            }

            // // precompute
            int[] hash = new int[13]; // // depending upon the maximum size of array we declared hash.
            for(int i = 0; i < n; i++){
                hash[arr[i]] += 1;
            }


            System.out.println("Enter the number of queries");
            int q = sc.nextInt();
            // / while (q--) { --> In C++, the while(q--) works because C++ treats non-zero integers as true, and 0 as false. But in Java, the condition inside while(condition) must be explicitly boolean — like true, false, or something that returns a boolean. You can’t use an integer directly.
            while (q-- > 0) {
                System.out.println("Enter the query number: ");
                int number = sc.nextInt();
                // // fetch
                System.out.println(hash[number]);

            }
        }finally{
            sc.close();
        }
    }
}