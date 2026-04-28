import java.util.Scanner;
public class ByteConverter{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

    System.out.print("enter Byte\n");
int byte1 = input.nextInt();
                                                                                                                         
        double sum1 = byte1 / 1024;
        double sum2 = byte1 / 1004576;
            double sum3 = byte1 / 1073741824; 
            
System.out.printf("kilobyte is %f %n megabyte is %f %n gigabyte is %f %n", sum1, sum2, sum3);

}
}
