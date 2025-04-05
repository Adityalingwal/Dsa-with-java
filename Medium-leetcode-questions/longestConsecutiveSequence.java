import java.util.HashSet;
import java.util.*;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = { 11, 4, 10, 1, 12, 3, 1, 1, 13, 14, 15 };
        int n = arr.length;

        int ans = longestSequence(arr, n);

        System.out.println("Longest consecutive sequence is : " + ans);
    }

    public static int longestSequence(int arr[], int n) {
        if (n == 0)
            return 0;
        int longest = 1;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }

        for (int it : set) {
            if (!set.contains(it - 1)) {
                int cnt = 1;
                int x = it;

                while (set.contains(x + 1)) {
                    cnt++;
                    x++;
                }
                longest = Math.max(longest, cnt);
            }
        }

        return longest;

    }

}
