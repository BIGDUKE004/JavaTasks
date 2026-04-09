import java.util.Scanner;
public class Atm{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter pin \n");
int number1 = input.nextInt();

if (number1 >= 1000  &&  number1  <= 9999){
System.out.println("Valid pin");
}  else {
System.out.println("Invalid pin");
}  

}
}
