package arrays;

import java.util.Arrays;

public class ReverseAnArray {
    public static int[] reverseAnArray(int[] numbers){
        int[] reversedArray = new int[numbers.length];
        int k = numbers.length-1;
        for(int num: numbers){
            reversedArray[k] = num;
            k--;
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int[] revArray = reverseAnArray(nums);
        System.out.println("Original Array is "+ Arrays.toString(nums));
        System.out.println("Reversed Array is "+ Arrays.toString(revArray));
    }
}
