public class removeDuplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5 };
        int length = arr.length;
        int firstUnique = 0;

        int value = duplicate(arr, length, firstUnique);

        System.out.println("There are " + value + " unique number");
    }

    public static int duplicate(int arr[], int length, int unique) {
        for (int i = 1; i < length; i++) {
            if (arr[unique] != arr[i]) {
                arr[unique + 1] = arr[i];
                unique++;
            }
        }
        return unique + 1;

    }
}
