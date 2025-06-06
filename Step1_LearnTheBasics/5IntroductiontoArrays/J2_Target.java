public class J2_Target {
    public static void main(String[] args)
    {   int target;
        int[] arr;
        arr = new int[6];
        arr[0] = 23;
        arr[1] = 56;
        arr[2] = 77;
        arr[3] = 34;
        arr[4] = 65;
        arr[5] = 58;
        target = 65;
        System.out.println(FindTarget(arr, target));
    }
    public static boolean FindTarget(int arr[], int target)
    {
        for(int i = 0; i <= 5; i++)
        {
            if(arr[i] == target)
            {
                return true;
            }
        }
        return false;
    }
}
