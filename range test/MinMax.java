public class MinMax{

    public static int getRangeOf(int [] numbers){
int [] numbers = {2,3,1,2}; 
int result = 0;

for(int count = 1; count <= numbers.length; count++){

int maximum = numbers[3];
int minimum = numbers[0];

result = maximum - minimum;
}

return result;

}

        public static int getValueOf(int [] digit){
int [] digit = {3,1,3,3};
int result = 0;

for(int count = 1; count <= digit.length; count++){

int maximum = digit[3];
int minimum = digit[0];

result = maximum - minimum;
}

return result;
}

public static void main(String[] args){

System.out.print(getRangeOf(numbers));
Systen.out.print(getValueOf(digit));


}

}
