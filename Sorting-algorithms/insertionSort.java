public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 50, 12, 20, 44, 1, 3 };
        int length = arr.length;

        System.out.print("Unsorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.print("sorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
