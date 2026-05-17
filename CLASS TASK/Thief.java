// write a program that simulates the catching a thief , hint = program ends when i type thief 

public class Thief{
    public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);

    while (true){
        System.out.print("Enter THIEF to catch the thief: ");
            String thiefcatcher = input.nextLine();

        if(thiefcatcher.replaceAll(" ", "").equalsIgnoreCase("thief"))
                break;


}


}

}
