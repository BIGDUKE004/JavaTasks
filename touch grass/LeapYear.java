public class LeapYear{
    public static void main(String[] args){

for(int leap = 2000; leap <= 2100; leap = leap + 10){

        if(leap % 4 == 0 ){
System.out.println( leap + " is a leap year");
} 
if(leap % 100 == 0 ){
System.out.println( leap + " is not a leap year");
}
if(leap % 400 != 0 ){
System.out.println( leap + "is a leap year");
}

}
}
}
