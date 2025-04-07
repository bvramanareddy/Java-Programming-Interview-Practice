package arrays;

import java.util.HashSet;

public class SeparateEvenOddFromArray {
    public static void separateEvenOddFromArray(int[] nums){
        HashSet<Integer> evenNumbers  = new HashSet<>();
        HashSet<Integer> oddNumbers = new HashSet<>();
        for (int num : nums){
            if (num%2 == 0) evenNumbers.add(num);
            else oddNumbers.add(num);
        }
        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }

    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7};
        separateEvenOddFromArray(n);
    }
}
