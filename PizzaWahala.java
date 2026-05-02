// an app that will collect input from the user which is the number of people attending the party and type of pizza to serve, the my output would be the amount of pizzza that will be delivered, leftovers after sharing the pizza and and the price of the order
//welcome message 
//menu otp1
//menu otp2






public class PizzaWahala{
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);


System.out.println("         WELCOME TO ARAMIDE'S PIZZA HUB");
System.out.println("MENU");
System.out.println("TYPE 1 TO ORDER PIZZA");
int menu1 = input.nextInt();

        if(menu1 == 1){
System.out.println(""" 
1. SAPA SIZE           NUMBER OF SLICE: 4                  PRICE: 2,500
2. SMALL MONEY           NUMBER OF SLICE: 6                  PRICE: 2,900
3. BIG BOYS           NUMBER OF SLICE: 8                  PRICE: 4,000
4. ODOGWU           NUMBER OF SLICE: 12                  PRICE: 5,200
""");
}  

System.out.println("ENTER NUMBER OF PEOPLE: ");
int order1 = input.nextInt();

input.nextLine();

System.out.println("ENTER PIZZA TYPE:  ");
int order2 = input.nextInt();


    switch (order2){
            case 1->{ 
    int box = 0;
    int leftover = 0;
    int price = 0;
    int add = 0;

       if(order1 % 4 != 0){
        add = order1 + 4;
        box = add / 4;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box);
} else if(order1 % 4 == 0){
        box = order1 / 4;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box);
}
       
        leftover = add % 4;
System.out.println("YOUR LEFTOVER WOULD BE:" + leftover);

         price = box * 2500;
System.out.println("TOTAL AMOUNT IS:" + price);
 }
 
            case 2 ->{
            
    int box1 = 0;
    int leftover1 = 0;
    int price1 = 0;
    int add1 = 0;

       if(order1 % 6 != 0){
        add1 = order1 + 6;
        box1 = add1 / 6;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box1);
} else if(order1 % 6 == 0){
        box1 = order1 / 6;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box1);
}
         leftover1 = box1 % 6;
System.out.println("YOUR LEFTOVER WOULD BE:" + leftover1);
    
         price1 = box1 * 2900;
System.out.println("TOTAL AMOUNT IS:" + price1);
}
 

 
            case 3 ->{ 
    int box2 = 0;
    int leftover2 = 0;
    int price2 = 0;
    int add2 = 0;

       if(order1 % 8 != 0){
        add2 = order1 + 8;
        box2 = add2 / 8;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box2);
} else if(order1 % 8 == 0){
        box2 = order1 / 8;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box2);
}
         leftover2 = box2 % 8;
System.out.println("YOUR LEFTOVER WOULD BE:" + leftover2);
    
        price2 = box2 * 4000;
System.out.println("TOTAL AMOUNT IS:" + price2);
    }    
  

 
            case 4 ->{ 
    int box3 = 0;
    int leftover3 = 0;
    int price3 = 0;
    int add3 = 0;

       if(order1 % 12 != 0){
        add3 = order1 + 12;
        box3 = order1 / 12;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box3);
} else if(order1 % 12 == 0){
        box3 = order1 / 12;
System.out.println("NUMBER OF BOXES TO BUY IS:" + box3);
}
         leftover3 = box3 % 12;
System.out.println("YOUR LEFTOVER WOULD BE:" + leftover3);
    
         price3 = box3 * 5200;
System.out.println("TOTAL AMOUNT IS:" + price3);
        }


    default->{
System.out.println("Invalid input");
    }
 
}




    


}
}
