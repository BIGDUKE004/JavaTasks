import java.util.Scanner;
    public class Comparator{
        public static void main(String[] args){
         Scanner userinput = new Scanner(System.in);

System.out.print("enter number: ");
            int numone = userinput.nextInt();

        System.out.print("enter number: ");
            int numtwo = userinput.nextInt();

if(numone == numtwo){
System.out.println(0);
} else if(numone > numtwo){
System.out.println(1);
} else if(numtwo > numone){
System.out.println(-1);
}
}
}
