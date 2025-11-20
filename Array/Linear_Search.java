public class Linear_Search {
    public static int linearsearch(int numbers[], int key){ // function for linear search
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == key){   // logic for linear search
                return i;
            } 
        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[] = {2, 4, 6, 8, 7, 10, 12};
        int key = 8;
        int index = linearsearch(numbers, key); // calling function
        if (index == -1){
            System.out.println("Not found");  // print for not found 
        }else {
            System.out.println("Key found at index " + index); // print for found
        }
    }
}
