import java.util.Arrays;

public class TaskFive{
    public static int[] number(int[] element){
        int count = 0;
        for(int index = 0; index < element.length; index++) {
            if(element[index] % 2 != 0)
                count++;
        }
        
        int counter = 0;
        int[] odd = new int[count];
        for(int index = 0; index < element.length; index++) {
            if(element[index] % 2 != 0) {
                odd[counter] = element[index];
                counter++;
            }
        }
        
        return odd;

    }

    public static void main(String[] args) {
        
        int[] digit = {15,43,36,87,8,9};
        
        System.out.println(Arrays.toString(number(digit)));
    }
}
