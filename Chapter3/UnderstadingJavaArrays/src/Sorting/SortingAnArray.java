package Sorting;
import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args){
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print (numbers[i] + " "); //1 6 9
    }
}
