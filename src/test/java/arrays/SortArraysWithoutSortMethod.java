package arrays;

import java.util.Arrays;

public class SortArraysWithoutSortMethod {
    public static int[] sortArrayUsingBruteForce(int[] nums){
        for (int i=1; i<nums.length; i++){
            if (nums[i]<nums[i-1]){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,4,3,5,7,6};
        System.out.println(Arrays.toString(numbers));
       int[] result = sortArrayUsingBruteForce(numbers);
        System.out.println(Arrays.toString(result));
    }
}
