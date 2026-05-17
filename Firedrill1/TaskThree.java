import java.util.Scanner;
        public class TaskThree{
                    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int count = 1;
        int total = 0;
        int sum = 0;
        while(count <= 10){
System.out.println(" enter a number:  ");
int user = input.nextInt();
total = total + user;
sum = total / count;
count++;
}

System.out.println("the sum is " + total);
System.out.println("the sum is " + sum);




}
}
