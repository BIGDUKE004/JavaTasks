// pseudocode:  this program will continously collect inout for the user until the user indicate that he or she has put down what ever information they have which is miles driven and gallons used 
// the program will calculate and display the miles per gallon obtained for each trip and combine all the trips inputed together 
// result should be in floating point numbers 

import java.util.Scanner;
    public class GasMileage{
        public static void main(String[] args){
        Scanner userinput = new Scanner(System.in);

        System.out.print("Enter miles driven (enter 0  to sum all vaues): ");
        float num = userinput.nextFloat();

        System.out.print("Enter gallons used (enter 0  to sum all vaues): ");
        float num1 = userinput.nextFloat();

        float total = 0;
        float user = 0;
        float sum = 0;        
        
        while (num != 0 && num1 != 0){
        
        total = num / num1;

        user++;
        
        System.out.println(total);

        System.out.print("Enter miles driven(enter 0  to sum all vaues): ");
        num = userinput.nextFloat();

        System.out.print("Enter gallon used (enter 0  to sum all vaues): ");
        num1 = userinput.nextFloat();

        sum += total;
        
        System.out.println("your sum is =");
        System.out.println(sum);
        

}

}
}
