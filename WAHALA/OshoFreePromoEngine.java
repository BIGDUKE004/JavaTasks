public class OshoFreePromoEngine{

    public static int promoOne(int price, String promo){

int amount = 0;

if(price < 5000 && !promo.equals("STARTER10") && !promo.equals("BIGBOY20") && !promo.equals("OSHOFREE35") ){
amount = price;
} 
return amount;
}



    public static double promoTwo(double price, String promo){

double amount = 0;
double discount = 0;

if(price >= 5000 && price <= 14999 && promo.equalsIgnoreCase("STARTER10")){
discount = price * 0.10 ;
amount = price - discount;
}
return amount;
}  



    public static double promoThree (double price, String promo){

double amount = 0;
double discount = 0;

if(price >= 15000 && price <= 29999 && promo.equalsIgnoreCase("BIGBOY20")){
discount = price * 0.20;
amount = price - discount;
}
return amount;
}



    public static double promoFour(double price, String promo){


double amount = 0;
double discount = 0;

if(price >= 30000 && promo.equalsIgnoreCase("OSHOFREE35")){
discount = price * 0.35 ;
amount = price - discount;
} 
return amount;
}

}
