import java.util.ArrayList;
import java.util.Collections;

public class leadersInArray {
    public static void main(String[] args) {
        int arr[] = {10, 22, 12, 3, 0, 6,5};
        int n = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[n-1];
        result.add(max);
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                result.add(arr[i]);  
                max = arr[i];      
            }
        }
        
        Collections.reverse(result);
        
        System.out.println("Leaders in the array are:");
        for (int leader : result) {
            System.out.print(leader + " ");
        }
    }
}
