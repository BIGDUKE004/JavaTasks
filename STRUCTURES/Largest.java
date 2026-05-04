public class Largest{
    public static int max(int a, int b, int c){
int largest = a;

if(largest < b){
largest = b;
}
if(largest < c){
largest = c;
}
return largest;
}

public static void main(String[] args){
    System.out.println(max(10,5,3));
}

}
