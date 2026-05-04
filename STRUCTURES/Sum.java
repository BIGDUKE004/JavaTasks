public class Sum{
    public static int SumOfDigits(int n){
int sum = 0;

    while(n > 0){

    int digit = n % 10;
    n = n / 10;

    sum += digit;

}

return sum; 

}

public static void main(String[] args){

System.out.println(SumOfDigits(123));

}

}
