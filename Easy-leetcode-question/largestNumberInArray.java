
public class largestNumberInArray {
    public static void main(String[] args) {
        int arr[] = { 50, 12, 60, 44, 1, 3 };
        int length = arr.length;
        int largest = arr[0];

        for (int i = 1; i < length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        System.out.print("Largest number is:" + largest);

    }
}
