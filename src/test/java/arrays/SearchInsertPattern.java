package arrays;

import java.util.Arrays;

public class SearchInsertPattern {
    public static int searchInsert(int[] nums, int target){
        for (int i=0; i<nums.length; i++){
            if (nums[i]==target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int target = 2;
       int resultIndex=  searchInsert(numbers, target);
        System.out.println("Given Array is: "+ Arrays.toString(numbers));
        System.out.println("The Target: "+ target + " found at index "+ resultIndex );

    }
}
