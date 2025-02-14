public class leftRotateByOnePlace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int length = arr.length;
        int temp = arr[0];

        for(int i=1;i<length;i++){
            arr[i-1] = arr[i];
        }
        
        arr[length-1] = temp;

        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
