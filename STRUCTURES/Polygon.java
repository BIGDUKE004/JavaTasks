public class Polygon{
    public static double area(int n, double side){

double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
return area;

}
public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter number of sides: ");
int sides = input.nextInt();

int n = sides;

System.out.print("Enter side length: ");
double length = input.nextDouble();

double side = length;

System.out.println(area(n, side));
}

}
