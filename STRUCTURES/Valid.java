public class Valid{
    public static boolean isValid(double a, double b, double c){
if(a + b > c && a + c > b && b + c > a){
return true;
}else{
return false;
}
}

    public static double area(double a, double b, double c){

double sum = (a + b + c) / 2;
double area = sum * (sum - a) * (sum - b) * (sum - c);
double areaSquare =  Math.sqrt(area);
return areaSquare;
}

}
