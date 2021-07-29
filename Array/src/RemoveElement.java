import java.util.ArrayList;
import java.util.List;

/*
This is my shit answer
 */

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {

        int length = nums.length;

        List<Integer> indexs =new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(nums [i]==val) {
                indexs.add(i);
            }
        }

        for(int index : indexs){
            if(nums[index]==val){
                for (int j = index + 1; j < nums.length; j++) {
                    nums[j-1] = nums[j];
                }
                length--;
            }
        }

        return length;
    }


    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }

}
