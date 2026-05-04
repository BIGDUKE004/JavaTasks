public class Pentagon{
        public static double areaOfAPentagon(double side){

double area = (5 * (side * side) / (4 * 0.7265));
return area;
}
public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter number of sides: ");
double  length= input.nextDouble();

double side = length;

System.out.print(areaOfAPentagon(side));

}
}
