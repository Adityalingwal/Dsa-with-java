
public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 50, 12, 20, 44, 1, 3 };
        int length = arr.length;

        System.out.print("Unsorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("sorted array is : ");

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
