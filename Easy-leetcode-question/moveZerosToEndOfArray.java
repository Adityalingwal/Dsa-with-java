public class moveZerosToEndOfArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 3, 2, 1, 0, 4, 4, 5, 6, 0, 0, 7, 8, 5, 4, 5 };
        int length = arr.length;
        int j = -1;

        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) {
            System.out.println("There are no zeroes present in the array so array will remain same");
            return;
        }

        for (int i = j + 1; i < length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Second approach to solve this problem using single pointer :->

// public class moveZerosToEndOfArray {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 0, 3, 2, 1, 0, 4, 4, 5, 6, 0, 0, 7, 8, 5, 4, 5 };
//         int length = arr.length;
//         int j = 0;

//         for (int i = 0; i < length; i++) {
//             if (arr[i] != 0) {
//                 if (i != j) {
//                     int temp = arr[i];
//                     arr[i] = arr[j];
//                     arr[j] = temp;
//                 }
//                 j++;
//             }
//         }

//         for (int i = 0; i < length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }
