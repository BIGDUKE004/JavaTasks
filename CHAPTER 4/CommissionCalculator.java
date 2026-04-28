import java.util.Scanner;
        public class CommissionCalculator{
            public static void main(String[] args){
            Scanner userinput = new Scanner(System.in);

double total = 0;
double sum = 0;
double commission = 200;

for(int count = 1; count <= 4; count++){
        System.out.print("enter sales made for the week: ");
                double num = userinput.nextDouble();


total = total + num;

}
sum = total * 0.09;

System.out.printf(" your commision for this weeek is %f  plus %f gross sale for the week", commission, sum);


}
}
