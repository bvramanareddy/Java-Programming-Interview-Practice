package arrays;

import java.util.Arrays;

public class MaxMinFromIntegerArray {
    public static void findMaxAndMinValuesFromArray(int[] numbers){
        int minValue = numbers[0];
        int maxValue = numbers[0];
        for (int num: numbers){
            if (num> maxValue) maxValue = num;
            if (num< minValue) minValue = num;
        }
        System.out.println("Given Array is "+ Arrays.toString(numbers));
        System.out.println("Minimum value from array is "+ minValue);
        System.out.println("Maxmimum value from array is "+ maxValue);
    }

    public static void main(String[] args) {
        int[] nums= {14,3,4,5,7,9};
        findMaxAndMinValuesFromArray(nums);
    }
}
