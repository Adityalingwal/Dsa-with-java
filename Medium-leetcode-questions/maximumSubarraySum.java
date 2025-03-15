//This is the kadane algorithm

public class maximumSubarraySum {
    public static void main(String[] args) {
        int arr[] = { -2, -3, -1, -3, 0 };
        long max = Long.MIN_VALUE;
        long sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < arr.length; i++) {
            if (sum < 0) {
                sum = arr[i];
                start = i;
            } else {
                sum += arr[i];
            }

            if (sum > max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
        }

        if (max < 0) {
            System.out.println("No positive subarray found; maximum sum is: 0");
        } else {
            System.out.println("Maximum sum is: " + max + " from index " + ansStart + " to " + ansEnd);
        }
    }
}
