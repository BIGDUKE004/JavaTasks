//import java.util.Arrays;
public class DuplicateElimination{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    
int [] unique = new int[10];
    int result = 0;
    for (int count = 0; count < 10; count++){
    System.out.print("Enter a number: ");
    int userinput = input.nextInt();
    unique[count] = userinput;
    if(userinput == -1){
System.out.print("invalid input");
break;
}
    if (userinput == userinput){
    continue;
}
    }
    
    for(int out = 0; out < unique.length; out++){
    System.out.println(unique[out] + " ");
    
    }

   }

}


