import java.util.*;

public class array{
    public static void main (String arg[]){  // main function
        int marks[] = new int [50];
        Scanner sc = new Scanner (System.in); // takes a user input

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Physics = " + marks[0]);
        System.out.println("Chemistry = " + marks[1]);
        System.out.println("Maths = " + marks[2]);
    }
}