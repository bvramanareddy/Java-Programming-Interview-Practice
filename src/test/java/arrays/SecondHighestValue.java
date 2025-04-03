package arrays;

import java.util.Arrays;

public class SecondHighestValue {
    public static void findSecondHighestValue(int[] nums){
        int maxValue= nums[0];
        int secondMax = nums[0];
        for (int num : nums){
            if (num>maxValue){
                secondMax = maxValue;
                maxValue = num;
            } else if (num>secondMax && num!=maxValue) {
                secondMax = num;
            }
        }
        System.out.println("Given Array : " + Arrays.toString(nums));
        System.out.println("Largest Element: " + maxValue);
        System.out.println("Second Largest Element: "+secondMax);
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,34,5,67,9};
        findSecondHighestValue(numbers);
    }
}
