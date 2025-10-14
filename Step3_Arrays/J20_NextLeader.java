/*

Brute Force Approach:
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> tempLeaders = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i; j < n; j++) {
                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }
            if (leader == true) {
                tempLeaders.add(arr[i]);
            }
        }
        return tempLeaders;
    }
}

*/