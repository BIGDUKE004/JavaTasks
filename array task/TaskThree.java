public class TaskThree{
    public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
    
int [] scores = new int[10];
    int result = 0;
    for (int count = 0; count < 10; count++){
    System.out.print("Enter a number: ");
    int userinput = input.nextInt();
    scores[count] = userinput;
    }
    
    for(int out = 0; out < scores.length; out++){
    System.out.println(scores[out] + " ");
    
    }

   }

}


