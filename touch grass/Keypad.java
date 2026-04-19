import java.util.Scanner;
    public class Keypad{
        public static void main(String[] args){
Scanner userinput = new Scanner(System.in);

System.out.println("Enter a letter: ");
String letter = userinput.nextLine();

if(letter.equals("a") || letter.equals("A")){
System.out.println(2);
} else if(letter.equals("b") || letter.equals("B")){
System.out.println(2);
} else if(letter.equals("c") || letter.equals("C")){
System.out.println(2);
} else if(letter.equals("d") || letter.equals("D")){
System.out.println(3);
} else if(letter.equals("e") || letter.equals("E")){
System.out.println(3);
} else if(letter.equals("f") || letter.equals("F")){
System.out.println(3);
} else if(letter.equals("g") || letter.equals("G")){
System.out.println(4);
} else if(letter.equals("h") || letter.equals("H")){
System.out.println(4);
} else if(letter.equals("i") || letter.equals("I")){
System.out.println(4);
} else if(letter.equals("j") || letter.equals("J")){
System.out.println(5);
} else if(letter.equals("k") || letter.equals("K")){
System.out.println(5);
} else if(letter.equals("l") || letter.equals("L")){
System.out.println(5);
} else if(letter.equals("m") || letter.equals("M")){
System.out.println(6);
} else if(letter.equals("n") || letter.equals("N")){
System.out.println(6);
} else if(letter.equals("o") || letter.equals("O")){
System.out.println(6);
} else if(letter.equals("p") || letter.equals("P")){
System.out.println(7);
} else if(letter.equals("q") || letter.equals("Q")){
System.out.println(7);
} else if(letter.equals("r") || letter.equals("R")){
System.out.println(7);
} else if(letter.equals("s") || letter.equals("S")){
System.out.println(7);
} else if(letter.equals("t") || letter.equals("T")){
System.out.println(8);
} else if(letter.equals("u") || letter.equals("U")){
System.out.println(8);
} else if(letter.equals("v") || letter.equals("V")){
System.out.println(8);
} else if(letter.equals("w") || letter.equals("W")){
System.out.println(9);
} else if(letter.equals("x") || letter.equals("X")){
System.out.println(9);
} else if(letter.equals("y") || letter.equals("Y")){
System.out.println(9);
} else if(letter.equals("z") || letter.equals("Z")){
System.out.println(9);
} else{
System.out.println("invalid input");
}
}
}
