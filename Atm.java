//Build a simple ATM menu system using loops.
//  an atm machine helps with withdrawal
//have an array that stores the user money
// collect input from the user
// if the user clicks deposit add to the money in the array
// if the user clicks withdrawal, minus the money from the array
import java.util.Arrays;
public class Atm{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
            double [] user = {3000.00};

            System.out.print("""
                WELCOME DEAR USER....

1. Withdrawal
2. Deposit

            """);   
            int userinput = input.nextInt();    

        if(userinput == 2){
                System.out.println("enter deposit amount: ");
                double value = input.nextDouble();

        for(int count = 0; count < user.length; count++){
                user[count] += value;
    }
} else {
        System.out.println("enter withdrawl amount: ");
            double value = input.nextDouble();

         for(int count = 0; count < user.length; count++){

                if(value > user[count]){
        System.out.print("insuffcient fund, your balance is: ");
            break;
                }
            user[count] -= value;
            }

        }
   
System.out.println(Arrays.toString(user));
    }

}
