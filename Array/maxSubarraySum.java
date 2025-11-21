import java.util.*;
public class maxSubarraySum {

    public static int maxSubarraySum(int numbers[]){      // function for maxSubarraysum by prefix sum
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

        return 0;
    }
    public static void main (String args[]){
        int numbers[] = {5,4,-1,7,8};
        maxSubarraySum(numbers);  // calling maxSubarraySum

    }
}
