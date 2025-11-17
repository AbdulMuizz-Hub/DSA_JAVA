public class printSubarray {

    public static void printSubarrays(int numbers[]){     // function to print subarrays 
        for (int i = 0; i < numbers.length; i++){
            for (int j = i ; j < numbers.length; j++){
                for (int k = i ; k<=j; k++){
                    System.out.print(numbers[k] + "");  // loop for print subarrays
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main (String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers); // calling printSubarrays function

    }
}
