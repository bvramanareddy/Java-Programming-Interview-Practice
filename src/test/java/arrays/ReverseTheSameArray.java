package arrays;

import java.util.Arrays;

public class ReverseTheSameArray {
    public static int[] reverseInTheSameArray(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseInTheSameArray(numbers)));
    }
}
