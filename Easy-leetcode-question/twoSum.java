public class twoSum {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 1, 9 };
        int n = arr.length;
        int target = 5;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Yes targeted sum is present at:" + i + " " + j);
                }
            }
        }
    }

}
