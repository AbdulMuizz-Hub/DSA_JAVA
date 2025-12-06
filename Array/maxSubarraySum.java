import java.util.*;

public class maxSubarraySum {

    public static int maxSubarraySum(int numbers[]){      // function for maxSubarraysum by prefix sum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0 , end = 0;
        int maxStart = -1; 
        int maxEnd = -1;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        for (int i = 1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++){    // logic for prefix sum appproach
            start = i;   
            for (int j = i ; j < numbers.length; j++){
                end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1]; 
               
                if (maxSum < currSum){
                    maxSum = currSum;

                    maxStart = start; 
                    maxEnd = end;
                }
            } 
        }
        

        // 3. Print the results
        System.out.println("Maximum subarray sum = " + maxSum);
        
        // Print the max subarray itself
        if (maxStart != -1) {
            System.out.print("The max subarray is: {");
            for (int k = maxStart; k <= maxEnd; k++) {
                System.out.print(numbers[k]);
                if (k < maxEnd) {
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
        
        return maxSum; // Returning maxSum is more typical than returning 0
    }
        
    public static void kadanes(int numbers[]){  // function for kadanes algorithm
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int currentStart = 0; 
        int maximumStart = 0;     
        int maximumEnd = 0;

        for(int i = 0; i<numbers.length; i++){
            cs = cs + numbers[i];
            if(cs > ms){
                ms = cs;
                maximumStart = currentStart;
                maximumEnd = i;             
            }
            if(cs < 0){
                cs = 0;
                currentStart = i + 1;
            }
        }

        // Let's check if the result is non-positive.
        if (ms <= 0) {
            ms = Integer.MIN_VALUE; // Reset ms to find the max single element
            int singleElementIndex = 0;
            
            // Find the least negative number (the one closest to 0)
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > ms) {
                    ms = numbers[i];
                    singleElementIndex = i;
                }
            }
            // Set indices for the single-element max subarray
            maximumStart = singleElementIndex;
            maximumEnd = singleElementIndex;
        }
        // --- 3. Print Results ---
        System.out.println("Maximum subarray sum = " + ms);
        
        System.out.print("The max subarray is: {");
        for (int k = maximumStart; k <= maximumEnd; k++) {  // printing loop for subarrays
            System.out.print(numbers[k]);
            if (k < maximumEnd) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    public static void main (String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);  // calling kadanes function

    }
}
