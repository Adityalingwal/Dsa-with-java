public class sortedArrayOrNot {
   public static void main(String[] args) {
    int arr[] = { 1,1,4,4,5};
    int length = arr.length;
    boolean isArraySorted = true;

    for(int i=0;i<length-1;i++){

        if(arr[i]>arr[i+1]){
            isArraySorted = false;
            break;
        }
    }

    if(isArraySorted == true){
        System.out.println("Array is sorted");
    }
    else{
        System.out.println("Array is not sorted");
    }
   }
}