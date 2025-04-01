package arrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicatesInArray {

    public static int[] findDuplicatesInArray(int[] numbers)
    {
        HashSet<Integer> uniqueSet= new HashSet<>();
        HashSet<Integer> dupeSet = new HashSet<>();
        for (int num: numbers)
        {
            if (!uniqueSet.add(num))
            {
                dupeSet.add(num);
            }
        }
        int[] uniqueElements = new int[dupeSet.size()];
        int index= 0;
        for (int num: dupeSet)
        {
            uniqueElements[index++]= num;
        }
        return uniqueElements;
    }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4,4,5,6,7,6};
        int[] result= findDuplicatesInArray(nums);
        System.out.println("Given Array is "+ Arrays.toString(nums));
        System.out.println("DuplicateElements are "+ Arrays.toString(result));
    }

}
