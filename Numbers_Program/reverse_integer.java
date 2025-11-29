import java.util.*;
public class reverse_integer {
     public static int reverse(int x) { // creating function for reverse integer
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            reversed = reversed * 10 + digit; // reverse logic
        }

        return reversed;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

       int n = sc.nextInt();
       System.out.println(reverse(n));  // calling a reverese integer function 



    }
}
