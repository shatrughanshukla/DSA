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

Optimal Solution:
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> tempLeaders = new ArrayList<>();
        int n = arr.length;
        int maxii = arr[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= maxii) {
                tempLeaders.add(arr[i]);
                maxii = arr[i];
            }
        }
        reverse(tempLeaders, 0, tempLeaders.size() - 1);
        return tempLeaders;
    }

    private static void reverse(ArrayList<Integer> list, int start, int end) {
        while (end > start) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}

*/
