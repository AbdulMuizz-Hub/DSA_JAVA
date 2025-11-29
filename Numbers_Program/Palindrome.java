import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {  // creating a palindrome function
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reverted = 0;
        while (x > reverted) {              
            reverted = reverted * 10 + x % 10;  // reverse logic
            x /= 10;
        }

        return x == reverted || x == reverted / 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt ();
        System.out.print(isPalindrome(x));  // calling palindrome function
    }
}
