public class Test3{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("ENTER A POSITIVE NUMBER: ");
int num = input.nextInt();

    for(int count = 1; count <= 12; count++ ){

System.out.println(count + "x" + num + "=" + (count * num));

}


}
}
