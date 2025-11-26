import java.util.*;
public class reverse_integer {
     public static int reverse(int x) {
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);

       int n = sc.nextInt();
       System.out.println(reverse(n));  // calling a reverese integer function 



    }
}
