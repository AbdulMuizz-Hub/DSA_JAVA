import java.util.*;
public class maxSubarraySum {

    public static void maxSubarraySum(int numbers[]){      // function for maxSubarraysum
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0 , end = 0;

        for (int i = 0; i < numbers.length; i++){
            for (int j = i ; j < numbers.length; j++){
                currSum = 0;
                for (int k = i ; k<=j; k++){
                      // calculate sum of  subarrays
                      currSum += numbers[k];
                }
                // System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(" maximum subarray sum = " + maxSum);  // to print max subarray
        // to print subarray which has a max subarraysum
        System.out.print("Subarray: [ ");
        for(int x = start; x <= end; x++){
            System.out.print(numbers[x] + " ");
        }
        System.out.println("]");
    }
    public static void main (String args[]){
        int numbers[] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);  // calling maxSubarraySum

    }
}
