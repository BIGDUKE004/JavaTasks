public class StandardDeviation{



public static double summation(double [] number){
double sum = 0;
for(int check = 0; check < number.length; check++){
sum += number[check];
}
return sum;
}




public static double mean(double [] number){

double num = 0;
double value = 0;

for(int count = 0; count < number.length; count++){
num = number[count];
value++;
}

double subtotal = StandardDeviation.summation(number);
double total = subtotal / value;

return total;
}


public static double subtractMeanFromValue(double [] number){
double count = 0;
double mean = StandardDeviation.mean(number);

for(double list : number ){

double calculation = list - mean;
count += calculation * calculation;

}

return count;
}


public static double variance(double [] number){


double deviation = StandardDeviation.subtractMeanFromValue(number);
double total = deviation / (number.length - 1);


return Math.sqrt(total);

}






}
