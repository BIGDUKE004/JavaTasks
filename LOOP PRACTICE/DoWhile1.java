// write a program that collect an user input which is a pin and keep asking the user for it if the pin is not 4 digit, only numbers

public class DoWhile1{
        public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);

int repeat = 0;
do{ 
System.out.println("ENTER A PIN: ");
repeat = input.nextInt();

if(repeat >= ('9''9''9''9') ||  repeat <= ('1''0''0''0')){
System.out.println("INVALID PIN");
}

repeat++;
} while(repeat > 9999 || repeat < 1000 );

//int [] score = new int [repeat];
//
//for(int sco : score){
//System.out.println(sco);
//}



}

}
