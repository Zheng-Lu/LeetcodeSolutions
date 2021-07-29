import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZeros2 {
    public static int[] duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num : arr) {
            if (num == 0) {
                list.add(0);
            }
            list.add(num);
        }
        for (int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(array)));

    }
}