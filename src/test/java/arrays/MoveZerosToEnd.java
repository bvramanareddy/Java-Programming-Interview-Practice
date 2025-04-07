package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static int[] moveZerosToEnd(int[] nums) {
        int nonZeroIndex = 0;
        for (int num : nums) {  // [0,1,2,0,3] --> [1,2,3,0,0]
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }
        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 0, 3};
        int[] resultArray = moveZerosToEnd(numbers);
        System.out.println("Given Array is " + Arrays.toString(numbers));
        System.out.println("After Moving Zeros to End " + Arrays.toString(resultArray));
    }
}
