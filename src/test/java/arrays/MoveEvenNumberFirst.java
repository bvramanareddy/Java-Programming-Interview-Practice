package arrays;

import java.util.Arrays;

public class MoveEvenNumberFirst {
    public static int[] moveEvenNumbersToFirst(int[] nums){
        int evenIndex= 0;
        int[] result = new int[nums.length];
        for (int num : nums){
            if (num%2==0){
                result[evenIndex] = num;
                evenIndex++;
            }
        }
        for (int num : nums){
            if (num%2!=0){
                result[evenIndex] = num;
                evenIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] res = moveEvenNumbersToFirst(arr);
        System.out.println(Arrays.toString(res));
    }
}
