public class secondLargestNumberInArray {
    public static void main(String[] args) {
        int arr[] = { 50, 11, 60, 441, 111, 3 };
        int length = arr.length;
        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < length; i++) {

            if (largest < arr[i]) {
                slargest = largest; 
                largest = arr[i];
            }

            else if (largest > arr[i] && arr[i] > slargest) {
                slargest = arr[i];
            }

        }

        if(slargest==Integer.MIN_VALUE){
            System.out.println("There is no second smallest number.");
        }
        else{
            System.out.println("Smallest number is:" + largest);
            System.out.println("Second smallest number is:" + slargest);
        }

    }
}