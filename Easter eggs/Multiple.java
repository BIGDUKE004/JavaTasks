import java.util.Scanner;
public class Multiple{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter digit \n");
int number1 = input.nextInt();

    System.out.print("enter digit \n");
int number2 = input.nextInt();

if (number1 % number2  == 0 ) {
System.out.printf(" %d is a multiple of %d %n \n", number1, number2);
} else { 
 System.out.print(" your first input is not a multiple of the second  \n");
}
}
}
