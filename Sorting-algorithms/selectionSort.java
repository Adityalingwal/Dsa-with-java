public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 50, 12, 20, 44, 1, 3 };
        int length = arr.length;

        System.out.print("Unsorted array is : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.print("sorted array is : ");

        for(int i=0;i<length;i++){
            int smallest = i;
            for(int j=i+1;j<length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        
    }
}
