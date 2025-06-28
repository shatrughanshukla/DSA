import java.util.*;

class freq{
    static void frequency(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

public class J9_J1QuestionUsingMap {
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
            freq.frequency(arr, n);

        }finally{
            sc.close();
        }
    }
}
