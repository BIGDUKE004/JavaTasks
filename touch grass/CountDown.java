//collect input from user, and use loop to do a countdown with the user
//collect input 
//use loop to do a countdown for it 
//attach blast off!  to it 
//
import java.util.Scanner;
    public class CountDown{
        public static void main(String[] args){
Scanner userinput = new Scanner(System.in);

System.out.print("Enter a digit for your countdown: ");
int count = userinput.nextInt();

while(count > 0){
System.out.println(count);
count--;
}
System.out.println("Blast off!");
}
}
