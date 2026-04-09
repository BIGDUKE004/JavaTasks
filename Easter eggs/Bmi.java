import java.util.Scanner;
public class Bmi{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

        System.out.print("enter weight\n");
double number1 = input.nextDouble();

        System.out.print("enter height\n");
double number2 = input.nextDouble();

double sum1 = number1;
double sum2 = number2;
double sum3 = sum1 / (sum2 * sum2);

if (sum3 < 18.5){
System.out.println("underweight");
} else if (sum3 < 24.9){
System.out.println("normal");
} else if (sum3 < 29.9){
System.out.println("overweight");
} else if (sum3 > 30){
System.out.println("obese");
}
 
}
}
