import java.util.Scanner;
public class Descending{
public static void main(String[] args){

Scanner input =  new Scanner(System.in);

    System.out.print("enter three numbers \n");
int number =  input.nextInt();

int num = number % 10;
number = number / 10;
int num1 = number % 10;
number = number / 10;
int num2 = number % 10;

System.out.printf(" %d%d%d %n ", num, num1, num2);
}

}
