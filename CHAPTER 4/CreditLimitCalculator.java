import java.util.Scanner;
        public class CreditLimitCalculator{
            public static void main(String[] args){
            Scanner userinput = new Scanner(System.in);

System.out.print("enter account number: ");
double limitone = userinput.nextDouble();

System.out.print("enter balance at the beginning of the month: ");
double limittwo = userinput.nextDouble();

System.out.print("enter total of all items charged by the customer this month: ");
double limitthree = userinput.nextDouble();

System.out.print("enter total of all credits applied to the customer’s account this month: ");
double limitfour = userinput.nextDouble();

System.out.print("enter allowed credit limit.: ");
double limitfive= userinput.nextDouble();

double total = (limittwo + limitthree) - limitfour;

if(total < limitfive){
System.out.print(total);
} else {
System.out.println("credit limit exceeded");
}

}
}
