public class Test4{
        public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);
int count = 0;

do{
System.out.print("ENTER A VALID NUMBER: ");
count = input.nextInt();
if(count < 1 || count > 10){
System.out.println("invalid input try again");
count++;

} 

}while(count < 1 || count > 10);

}
}
