// sum up the input of a user
public class SumOfDigit{
        public static int sumDigit(long n){
int sum = 0;

while(n > 0){

long digit = n % 10;
n = n / 10; 
sum += digit;

}
return sum;
}

public static void main(String[] args){

System.out.println(sumDigit(1234));


}

}
