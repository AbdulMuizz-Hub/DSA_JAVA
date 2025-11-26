
public class Binary_Search { // function for binary search
    public static int binarySearch(int numbers[] , int key){
        
        int start = 0;
        int end = numbers.length-1;

        while (start <= end) {               // binary search logic
            int mid = (start+end)/2;
            if (numbers[mid] == key) {
                return mid ;
            }
            if(numbers[mid] < key ){
                start = mid + 1 ;
            }
            if(numbers[mid] > key){
                end = mid - 1 ;
            } 
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16,18,}; // input value
        int key = 12;
        System.out.println(binarySearch(numbers, key)); // function calling in SOP
    }
    
}
