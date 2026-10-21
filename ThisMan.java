public class ThisMan{
    public static void main(String[] args){
        
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int count = 1; count < number; count++){
            int remainder = number % 10;
            number = number / 10;
            System.out.println(remainder);
            }
            
    }
}
