import java.util.Scanner;
    public class Largest{
        public static void main(String[] args){
         Scanner userinput = new Scanner(System.in);

System.out.print("enter a number:  ");
int number = userinput.nextInt();

while (number != 1 && number != 2){
   
    System.out.print("enter a number:  ");
    number = userinput.nextInt();

}

 number++; 
}
}
