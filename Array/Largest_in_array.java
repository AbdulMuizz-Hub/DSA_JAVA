import java.util.*;

public class Largest_in_array {  // function to find largest number in array
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // minus infinity
        for(int i = 0 ; i < numbers.length; i++){
            if (largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
    int numbers[] = {1,2,6,3,5};
    System.out.println("Laregst value is " + getLargest(numbers));  // calling function 
    }    
    
}
