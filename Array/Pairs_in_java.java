public class Pairs_in_java{
    
    public static void printPairs(int numbers[]){ // pairs in array function
        int Total_pair = 0 ;
        for(int i = 0; i<numbers.length;i++){    // logic 
            int current = numbers[i];
            for(int j= i+1 ; j<numbers.length; j++){
                System.out.print("(" + current + "," + numbers[j] + ")");
                Total_pair++;
            }
            System.out.println();
        }
        System.out.println("Total Number of pairs = " + Total_pair); // print total pairs

    }
    
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printPairs(numbers);  // calling function
    }
}