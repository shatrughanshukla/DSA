import java.util.*;
class Solution {
    public static int mostFreqEle(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
         
        int maxFreq = 0;
        int value = -1;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int freq = entry.getValue();
            if(freq > maxFreq){
                maxFreq = freq;
                value = key;
            }else if(freq == maxFreq && key > value){
                value = key;
            } 
        }
        return value;
    }
}
public class J10MostFreqElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the length of the Array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                System.out.println("Enter the value of index: " + i);
                arr[i] = sc.nextInt();
            }
            int highestFreq = Solution.mostFreqEle(arr);
            System.out.println();
            System.out.println("The highest freq is of: " + highestFreq);

        }finally{
            sc.close();
        }
    }
    
}