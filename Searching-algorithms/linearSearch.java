public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int element = 2;

        int search = linear(arr, element);

        if (search == -1) {
            System.out.println("Element is not present in the array");
        } else {
            System.out.println("Element is at index " + search);
        }

    }

    public static int linear(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

}
