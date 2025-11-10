import java.util.*;

public class array{
    public static void main (String arg[]){
        int marks[] = new int [50];
        Scanner var1 = new Scanner (System.in);

        marks[0] = var1.nextInt();
        marks[1] = var1.nextInt();
        marks[2] = var1.nextInt();

        System.out.println("Physics = " + marks[0]);
        System.out.println("Chemistry = " + marks[1]);
        System.out.println("Maths = " + marks[2]);
    }
}