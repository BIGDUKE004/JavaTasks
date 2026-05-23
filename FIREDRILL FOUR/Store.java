
import java.util.Arrays;

public class IntegerArrayCollector {

    public static int[] list () {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integers:");

        for (int digit = 0; digit < numbers.length; digit++) {
            
            numbers[digit] = input.nextInt();
        }

        return numbers;
    }

