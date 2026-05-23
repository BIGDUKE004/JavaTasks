//initialize your array
//store the first number and maximum
//compare it with the rest of the array list




public class Max{
    public static void main(String[] args){

java.util.Scanner input = new java.util.Scanner(System.in);

int [] number = new int[10];

int maximum  = number [0];

System.out.print("enter numbers: ");
int userinput =  input.nextInt();

for(int counter = 0; counter < number.length; counter++){
System.out.print("enter numbers: ");
userinput =  input.nextInt();
number[counter] = userinput;
}

for(int num = 0; num < number.length; num++){

if(maximum < number[num]){
maximum = number[num];
}


}

System.out.println("the largest is: " + maximum);
}
}
