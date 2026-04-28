public class Pizza{
    public static int pizzaSapaSize(int number){
    int add = 0;
    int box = 0;
    int leftover = 0;
    int price = 2500;
     
        if(number % 4 != 0){
        add = number + 4;
        box = add / 4;
        } else if(number % 4 == 0){
        box = number / 4;
        }   

        leftover = add % 4;
        //return leftover;

        price *= box;
        //return price;
        
        return box;
        
        }
        

    public static int pizzaSmallBoys(int number){
    int add = 0;
    int box = 0;
    int leftover = 0;
    int price = 2900;
  

       if(number % 6 != 0){
        add = number + 6;
        box = add / 6;
        } else if(number % 6 == 0){
        box = number / 6;
        }

         leftover = box % 6;
        return leftover;   

         //price *= box;
        //return price;

        //return box;
        }


    public static int pizzaBigBoys(int number){
    int addtwo = 0;
    int boxtwo = 0;
    int leftovertwo = 0;
    int pricetwo = 4000;
   
       
        if(number % 8 != 0){
        addtwo = number + 8;
        boxtwo = addtwo / 8;
        } else if(number % 8 == 0){
        boxtwo = number / 8;
        }
        leftovertwo = boxtwo % 8;
        //return leftovertwo;
    
        pricetwo *= boxtwo;
        return pricetwo;

        //return boxtwo;

    }    

    public static int pizzaOdogwu(int number){
    int add = 0;
    int boxthree = 0;
    int leftoverthree = 0;
    int pricethree = 5200;

       if(number % 12 != 0){
        add = number + 12;
        boxthree = number / 12;
        } else if(number % 12 == 0){
        boxthree = number / 12;
        }

        leftoverthree = boxthree % 12;
       // return leftoverthree;
    
         pricethree *= boxthree; 
        return pricethree;

       // return boxthree;  

    }


public static void main(String[] args){

int pizzaSapa =   pizzaSapaSize(50) ;
int pizzaSmall=  pizzaSmallBoys (50);
int pizzaBig = pizzaBigBoys(50);
int pizzaOd = pizzaOdogwu(50);

System.out.println(pizzaSapa);
System.out.println(pizzaSmall);
System.out.println(pizzaBig);
System.out.println(pizzaOd);

}
}

