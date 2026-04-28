public class BackToSender{

   
public static int Allowance(int uservalue){
        int total = 0;

        if(uservalue <= 50){
        total = uservalue * 160 + 5000;
        return(total);
       
        } else if(uservalue <= 59){
        total = uservalue * 200 + 5000;
        return(total);
       
        } else if(uservalue <= 69){
        total = uservalue * 250 + 5000;
        return(total);
       
        } else {
        total = uservalue * 500 + 5000;
        return(total);
        
        }            
    }

  public static void main(String[] args){
  int total = 0;
System.out.print(total);
  
}

}





