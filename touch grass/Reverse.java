import java.util.Scanner;
        public class Reverse{
            public static void main(String[] args){

            Scanner userinput = new Scanner(System.in);

            System.out.print("enter a number: ");
            int digit = userinput.nextInt();
int num = 0;
          // int count = 0;
            while(num > 0){
            num = digit % 10;
            digit = digit / 10;
System.out.println(num);

}
num++;
}
}
