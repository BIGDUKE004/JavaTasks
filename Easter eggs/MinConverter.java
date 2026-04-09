import java.util.Scanner;
public class MinConverter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter minutes\n");
int min = input.nextInt();
                                                                                                                         
        int min1 = min / 1440;
int min2 = min - (min1 * 1440);
        int min3 = min2 / 60;
            int min4 = min2 % 60 ; 
            
System.out.printf("day is %d %n hour is %d %n minute is %d %n", min1, min3, min4);

}
}
