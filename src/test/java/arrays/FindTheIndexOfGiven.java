package arrays;

public class FindTheIndexOfGiven {
    public static void findTheIndexOfGivenNumber(int[] nums, int targetNumber){
        boolean found =false;
        for (int i=0;i<nums.length; i++){
            if (nums[i] == targetNumber){
                System.out.println("The Target Indices are "+ i);
                found= true;
            }
        }
        if (!found){
            System.out.println("Given Number is not present");
        }
    }

    public static void main(String[] args) {
        int[] n = {1,1,1,2,2,3,4,5,6,6};
        int tarNum = 1;
        findTheIndexOfGivenNumber(n, tarNum);
    }
}
