import java.util.Arrays;

public class TaskFour{
    public static int[] number(int[] element){
        int count = 0;
        for(int index = 0; index < element.length; index++) {
            if(element[index] % 2 == 0)
                count++;
        }
        
        int counter = 0;
        int[] even = new int[count];
        for(int index = 0; index < element.length; index++) {
            if(element[index] % 2 == 0) {
                even[counter444444444444444444444444444444444444444444444444444444444477777774444444444444444444444] = element[index];
                counter++;
            }
        }
        
        return even;

    }

    public static void main(String[] args) {
        
        int[] digit = {15,43,36,87,8,9};
        
        System.out.println(Arrays.toString(number(digit)));
    }
}

