// public class J4_MaxCountofConsecutive1 {
//     public static void main(String[] args) {
//         int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0};
//         int maxCons1 = 0;
//         int count = 0;
//         for(int i = 0; i< arr.length; i++)
//         {
//             if(arr[i] == 1)
//             {
//                 count++;
//             }
//             else{
//                 if(arr[i] == 0){
//                     if(count > maxCons1)
//                     {
//                         maxCons1 = count;
//                         count = 0;
//                     }
//                 }
//             }
//         }
//         System.out.println(maxCons1);
//     }
// }
// // // Ma'am's method
public class J4_MaxCountofConsecutive1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0};
        int maxCons1 = 0;
        int count = 0;
        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] == 1)
            {
                count++;
                maxCons1 = Math.max(maxCons1, count);
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxCons1);
    }
}
// // Both approches are good.