import java.util.*;
public class bubbleSort {    
    public static void bubbleSorting(int arr[]){  // bubble sort function
        for(int turn=0; turn<arr.length-1; turn++){
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // printing function
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
    // main function 
    public static void main (String args[]){
        int arr[] = {5,4,1,3,2};
        bubbleSorting(arr); // calling bibble sort function
        printArr(arr); // calling printing array function
    }
}
