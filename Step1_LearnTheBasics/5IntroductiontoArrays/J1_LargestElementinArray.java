public class J1_LargestElementinArray{
    public static void main(String[] str)
    {
        int maxi = 0;
        int[] arr;
        arr = new int[6];
        arr[0] = 23;
        arr[1] = 56;
        arr[2] = 77;
        arr[3] = 34;
        arr[4] = 65;
        arr[5] = 58;
        maxi = arr[0];
        for(int i = 0; i<=5; i++)
        {
            if(arr[i] > maxi)
            {
                maxi = arr[i];
            }
        }
        System.out.println(maxi);
        
    }
}