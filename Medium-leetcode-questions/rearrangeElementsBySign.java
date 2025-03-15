//This is the first variety where there will be equal number of postives and negatives and this will be the optimal solution and also here
//space complexity will be 0(n) because we need extra space to store the array.

public class rearrangeElementsBySign {
    public static void main(String[] args) {
        int arr[] = { 3, 1, -2, -5, 2, -4 };
        int n = arr.length;
        int arr2[] = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr2[negIndex] = arr[i];
                negIndex += 2;
            } else {
                arr2[posIndex] = arr[i];
                posIndex += 2;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}