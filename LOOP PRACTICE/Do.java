// collect a user input of student score (this working), store it in an array, and find the highest and lowest

public class Do{
        public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print(" ENTER LIST SIZE: ");
int size = input.nextInt();

int [] grade = new int [size];

int count = 0;

do{
System.out.print("ENTER GRADE: ");
grade [count] = input.nextInt();
System.out.println(grade);
count++;
} while(count < size);



}

}
