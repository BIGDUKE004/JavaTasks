public class MathApp{

static int numberone = 5;
static int numbertwo = 4;

    public static int multiplicationOfNumbers(int valueone, int valuetwo){
return valueone * valuetwo;
}

    public static int divisionOfNumbers(int valueone, int valuetwo){
return valueone % valuetwo;
}

    public static int additionOfNumbers(int valueone, int valuetwo){
return valueone + valuetwo;
}

    public static int subtractionOfNumbers(int valueone, int valuetwo){
return valueone - valuetwo;
}

    public static int operatorSymbol(String operator){

int value = 0;

if(operator.equals("*")){
value = multiplicationOfNumbers(numberone, numbertwo);
}
 else if(operator.equals("+")){
value =  additionOfNumbers(numberone, numbertwo);
}
 else if(operator.equals("%")){
value =  divisionOfNumbers(numberone, numbertwo);
}
else if(operator.equals("-")){
value =  subtractionOfNumbers(numberone, numbertwo);
}

return value;

}




}
