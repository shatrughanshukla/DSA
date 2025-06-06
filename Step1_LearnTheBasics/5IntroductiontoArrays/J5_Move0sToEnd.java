public class J5_Move0sToEnd 
{
    public static void main(String[] args) {
        int[] arr = {40, 0, 20, 0, 10, 30};
        // int[] temp = new int[arr.length];
        int count = 0; // // to fill non zero elements
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] != 0)
            {
                //temp[count] = arr[i];
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length)
        {
            //temp[count] = 0;
            arr[count] = 0;
            count++;
        }
        //for(int n : temp){
        for(int n : arr){
            System.out.println(n + " ");
        }
    }       
}
// // try it with swap method. 
