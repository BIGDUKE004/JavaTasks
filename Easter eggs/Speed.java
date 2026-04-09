import java.util.Scanner;
public class Speed{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

        System.out.print("enter distance \n");
int number1 = input.nextInt();

        System.out.print("enter time \n");
int number2 = input.nextInt();

int sum = number1 / number2;

if (sum == 0 ){
System.out.println("Stationary");
} else if (sum <= 40){
System.out.println("Slow");
} else if (sum <= 80){
System.out.println("Fast");
} else if (sum > 120 ){
System.out.println("Dangerously fast");
}
 
}
}
