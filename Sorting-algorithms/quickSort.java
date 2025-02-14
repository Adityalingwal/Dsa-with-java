public class quickSort {
    public static void main(String[] args) {
        int arr[] = {  1, 3};
        int length = arr.length;

        System.out.print("Unsorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        quickSorting(arr, 0, length - 1);

        System.out.print("sorted array is : ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSorting(int arr[], int low, int high) {
        if (low >= high)
            return;

        int partition = quick(arr,low,high);
        quickSorting(arr, low, partition-1);
        quickSorting(arr, partition+1, high);

    }

    public static int quick(int arr[], int low, int high) {
     
        int pivot = arr[low];
        int i = low;
        int j = high;
        
        while(i<j){

            while(i<=high-1 && arr[i]<=pivot){
                i++;
            }

            while(j>=low+1 && arr[j]>pivot){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];  
        arr[low] = arr[j];   
        arr[j] = temp;        
        
        return j;
    }

}
