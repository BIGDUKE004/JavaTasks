public class Task4{
        public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);


int count = 0;
do{
System.out.print("ENTER A VALID NUMBER: ");
int num  = input.nextInt();

count++;
} while (count < 1 && count > 10);

}
}
