import java.util.Scanner;
public class CompoundInterestCalculator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter Bask sccount bslance \n");
int balance1 = input.nextInt();

     System.out.print("enter annual interest rate \n");
int balance2 = input.nextInt();
                                                                                                                         
        double sum1 = balance2 * 0.01;
        double sum2 = balance1 * (1 + balance2);
            double sum3 = balance1 * (1 + balance2) * (1 + balance2); 
            double sum4  = balance1 * (1 + balance2) * (1 + balance2) * (1 + balance2);

System.out.printf("sum of year1 is %f %n sum for year2 is %f %n sum for year3 is %f %n", sum2, sum3, sum4);


}
}
