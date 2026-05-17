//  write a program that collect that collect 10 input and store it in an array and print
    public class KataKata {
        public static void main(String[] args){
      java.util.Scanner input = new java.util.Scanner(System.in);

int [] box = new int[10];

    for(int digit = 1; digit <= 9; digit++){

System.out.print("ENTER A VALUE: ");
int value = input.nextInt();
box [digit] = value;
}

for(int value = 1; value <= 9; value++){
System.out.print( box[value]  + " ");
}
}
}
