import java.util.Scanner;
public class FizzBuzz{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter digit \n");
int number1 = input.nextInt();

if (number1 % 5  == 0 && number1 % 3 != 1 ) {
System.out.print("BUZZ \n");
} else if (number1 % 5 != 0 && number1 % 3 == 0 ) {
System.out.print("FIZZ \n");
} else if (number1 % 5 == 0 &&  number1  % 3 == 0 ){
System.out.println("FizzBuzz \n");
}  else {
System.out.printf("%d %n", number1);
}  

}
}
