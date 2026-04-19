import java.util.Scanner;
    public class ReverseNumber{
        public static void main(String[] args){
Scanner userinput = new Scanner(System.in);

System.out.print("Enter a positive number: ");
int value = userinput.nextInt();

//int value = 0;
//while(value > 0){
//int user = value % 10;
//System.out.println(user);
//value = value / 10;
//}
//value++;

for(; value > 0;){
int user = value % 10;
System.out.println(user);
value = value / 10;
}
value++;
}
}
