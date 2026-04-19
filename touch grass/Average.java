import java.util.Scanner;
public class Average{
    public static void main(String[] args){
Scanner userinput = new Scanner(System.in);
     
        int useraverage = 0;
        double average = 1;

        int count = 0;
while(true){
    System.out.print("Enter a negative number to stop: ");
    int uservalue = userinput.nextInt();
    count++;
    useraverage = useraverage + uservalue;
    average = useraverage / count;  
if(uservalue < 0){          
    System.out.println("This is the average of positive number: " + average);               
            break;
    }            
 } 
}
 }
