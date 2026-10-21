// write a function that count if it sees uppercase letters and numbers that occurs more than one 
//collect input
//intialize count to be 0
//create a loop to go through the user input 
//check for upper case letters using the .toUpperCase method 
//check for numbers that appears more than once
//
public class Detector{

    int result;

    public void countInsensitiveCharacters(String userinput){

    int count = 0;

    for(int counter = 0; counter < userinput.length(); counter++){

    char collect =  userinput.charAt(counter);
           
     String fill = String.valueOf(collect);

        if(fill.equals(fill.toUpperCase())){
              count++;
            }    
    }    
    
    this.result = count;

    }

    public static void main(String[] args){
    
    java.util.Scanner input = new java.util.Scanner(System.in);

    Detector detector = new Detector();

    System.out.print("Enter word: ");
    String userinput = input.nextLine();

    detector.countInsensitiveCharacters(userinput);

    System.out.println(detector.result);
    
}

}
