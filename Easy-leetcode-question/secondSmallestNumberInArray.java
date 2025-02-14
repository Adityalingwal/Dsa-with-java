public class secondSmallestNumberInArray {

    public static void main(String[] args) {
        int arr[] = { 50, 11, 10, 441, 111, 3 };
        int length = arr.length;
        int smallest = arr[0];
        int ssmallest = Integer.MAX_VALUE;

        for (int i = 1; i < length; i++) {

            if (smallest > arr[i]) {
                ssmallest = smallest; 
                smallest = arr[i];
            }

            else if (smallest < arr[i] && arr[i] < ssmallest) {
                ssmallest = arr[i];
            }

        }

        if(ssmallest==Integer.MAX_VALUE){
            System.out.println("There is no second smallest number.");
        }
        else{
            System.out.println("Smallest number is:" + smallest);
            System.out.println("Second smallest number is:" + ssmallest);
        }

    }
    
}
