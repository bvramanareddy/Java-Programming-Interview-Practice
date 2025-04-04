package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumTargetIndices {
    public static int[] findIndicesOfTwoSumOfTarget(int[] nums, int target){
        HashMap<Integer, Integer> complements =  new HashMap<>();
        for (int i=0; i<nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex!=null){
                return new int[] {i, complementIndex};
            }
            complements.put(target-nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] inputArray = {2,3,5,11};
        int target = 16;
        int[] resultIndices = findIndicesOfTwoSumOfTarget(inputArray, target);
        System.out.println("The Given Array is "+ Arrays.toString(inputArray) +  " and the Target is "+ target);
        System.out.println("Two Sum indices are "+ Arrays.toString(resultIndices));
    }
}
