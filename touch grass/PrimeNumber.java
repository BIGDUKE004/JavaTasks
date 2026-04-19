public class PrimeNumber{
        public static void main(String[] args){

int count = 0;
for(int num = 2 ; num <= 1200 ; num++){
        
        int divider = 0;

        for (int index = 0; index <= num; index++){
                if (num % index == 0){
                     divider++;

}
}      
        if (divider == 0){ 
              System.out.println(num);
              count++;

            if (count % 8 == 0){
                System.out.println();
}
}
}
}
}
