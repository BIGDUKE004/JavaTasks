// collect input from user, and use loop to do a countdown with the user//

import java.util.Scanner;
    public class CountDown{
        public static void main(String[] args){
Scanner userinput = new Scanner(System.in);

System.out.print("Enter a digit for your countdown: ");
int count = userinput.nextInt();

count = 0;
for(count = 0; count > 0; count--);
System.out.println(count)

}
}
