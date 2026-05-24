// create an array and also create a duplicate array to store in the new array
// now the first number in the array should be in there..... compare 

import java.util.Arrays;
public class Duplicate{
    public static void main(String[] args){

int [] array = {3, 4, 3, 5, 6, 3, 7, 8, 5, 7, 9, 2};

int [] dup = new int[array.length];

int size = 0;

for(int count = 0; count < array.length; count++){
    boolean found = false;

    for(int counter = 0; counter < size; counter++){
            if(array[count] == dup[counter]){
                    found = true;
                    break;
        }

    }

            if(!found){
dup[size] = array[count];
size++;
}
}


System.out.print(Arrays.toString(dup));
}
}
