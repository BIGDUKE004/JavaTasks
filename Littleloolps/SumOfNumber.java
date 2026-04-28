import java.util.Scanner;
public class SumOfNumber{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int sum = 1;
        System.out.print("enter input ");
int number = input.nextInt();
int n = number;

  int i = 1;
while (i <=  n){
System.out.println(sum);
sum += i;
i++;
}
}
}
