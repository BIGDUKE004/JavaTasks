package algorithm;

import java.util.Arrays;

public class Algorithm {
    public static int[] squareOfNumbers(int [] array){
        for(int count = 0; count < array.length; count++){
            array[count] = array[count] * array[count];
        }
        for(int counter = 0; counter < array.length; counter++){
            for(int index = counter+1; index < array.length; index++){
                if(array[counter] > array[index]){
                    int temp = array[counter];
                    array[counter] = array[index];
                    array[index] = temp;
                }
            }
        }
        return array;
    }

    public static String shortestWord(String userSentence){
        String[] words = userSentence.split(" ");
        String shortest = words[0];
        String regex = "[a-zA-Z]+";
        for(int count = 0; count < words.length; count++){
            if(shortest.matches(regex)){
                if(words[count].length() < shortest.length() && words[count].matches(regex)){
                    shortest = words[count];
                }
            }
        }
        return shortest;
    }

    public static void main(String[] args) {
        int [] arrays = {3,2,7,1,4};
        System.out.println(Arrays.toString(squareOfNumbers(arrays)));
        System.out.println(shortestWord("Are you coming from the island eh"));
    }
}
