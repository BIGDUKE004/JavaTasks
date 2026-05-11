//take ten integer from a user
//reverse 
//without creating a second array 
//how?....: collect and store the user input in an array
//reverse it how? loop through it 

public class Reverse{
    public static void main(String[] args){

    java.util.Scanner input = new java.util.Scanner(System.in);
int counter = 0;
int [] list = new int [10];
int reverse = 0;
    
    for(counter = 1; counter < 10; counter++){
        System.out.print("enter a number: ");
        int userinput = input.nextInt();
        list[counter] = userinput;
}

    for(int rev = 1; rev < list.length; rev++){
        reverse = list[rev] + reverse;
}
        System.out.println(reverse);
}
}
