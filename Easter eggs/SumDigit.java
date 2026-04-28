import java.util.Scanner;
public class SumDigit{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter five digit \n");
int digit = input.nextInt();

    int digitfive = digit % 10;
digit = digit / 10;
    int digitfour = digit % 10;
digit = digit / 10;
    int digitthree = digit % 10;
digit = digit / 10;
    int digittwo = digit % 10;
digit = digit / 10;
    int digitone = digit % 10;

        int sum = digitone + digitfive;

System.out.printf("sum is %d %n", sum);
}
}
