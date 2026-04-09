import java.util.Scanner;
public class Age{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int discount = 65;

    System.out.print("your birthyear \n");
int byear = input.nextInt();

    System.out.print("current year \n");
int year = input.nextInt();

int sum = year - byear;


  if (sum >= discount ){
System.out.print("your eligible for a senior citizen discount \n");
} else {
System.out.printf(" %d %n", sum);
}
}
}
