// input = [13, 7, 1, 8, 2]
// output = [13, 7]

import java.util.Arrays;
public class Drill{

    private int [] finalValue;

    public void getLargestSumOfTwoNumbersInAnArray(int [] value){

    int largest = 0;
    for(int count = 1; count < value.length; count++){
            //for(int counter = count+1; counter < value.length; counter++){
                    if( value[count-1] + value[count] > largest){
                largest = value[count-1] + value[count];
                    this.finalValue = new int [] {value[count-1], value[count]};
            
        }
    }

}

//    public static void main(String[] args){
//
//    Drill drill= new Drill();
//
//    int [] value = {13, 7, 1, 8, 2};
//
//    drill.getLargestSumOfTwoNumbersInAnArray(value);
//
//    System.out.print(Arrays.toString(drill.finalValue));
//
//}


}







