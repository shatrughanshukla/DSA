import java.util.Scanner;
class Solution{
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverse(int i, int[] arr, int n){
        if (i >= n/2) {
            return;
        }
        swap(arr, i, n-i-1);
        reverse(i+1, arr, n);
        


    }
}
public class J7ReverseanArray{
    public static void main(String[] aStrings){
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            int[] array = new int[n];

            for(int i = 0; i < n; i++){
                array[i] = sc.nextInt();
            }
            for(int i = 0; i < n; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            Solution.reverse(0, array, n);
            for(int i = 0; i < n; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
            
        }finally{
            sc.close();
        }
    }    
}
