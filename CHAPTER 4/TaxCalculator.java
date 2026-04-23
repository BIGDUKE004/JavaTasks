import java.util.Scanner;
        public class TaxCalculator{
            public static void main(String[] args){
            Scanner userinput = new Scanner(System.in);
 System.out.print("input your name: ");
            String name1 = userinput.nextLine();
int count = 1;
for(; count <= 3;){
count++;

        System.out.print("enter year: ");
            int year = userinput.nextInt();

        System.out.print("enter money earned in this year: ");
            double earning = userinput.nextDouble();

//count++;
if(earning <= 30000){
System.out.print("your tax rate is 15%\n");
} else{
System.out.print(" your tax rate is 30%\n");
}

}


}
}
