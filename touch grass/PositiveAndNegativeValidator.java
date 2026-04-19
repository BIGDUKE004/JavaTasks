// collect input from the user, access it if it is negative number and if it isnt keep on looping , then count all the positive number entered and sum up all positive number entered //




import java.util.Scanner;
        public class EvenOddValidator{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter a number: ");
int uservalue = input.nextInt();
int average = 0;
int count = 0;
for(count = 1; count > 0; count++){
    if(uservalue % 2 == 1){
  System.out.print("enter a number: ");
uservalue = input.nextInt();
}
if(uservalue % 2 == 0){
average += uservalue;
count /= average;
System.out.print(count)
} 
}

}
}
