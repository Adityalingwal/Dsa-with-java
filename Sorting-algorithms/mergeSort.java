import java.util.ArrayList;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 50, 12, 20, 44, 1, 3 };
        int length = arr.length;

        System.out.print("Unsorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        mergeSorting(arr, 0, length - 1);

        System.out.print("sorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void mergeSorting(int arr[], int low, int high) {
        if (low >= high)
            return;
        int mid = (low + high) / 2;
        mergeSorting(arr, low, mid);
        mergeSorting(arr, mid + 1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int arr[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low; 
        int right = mid + 1;


        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

}
