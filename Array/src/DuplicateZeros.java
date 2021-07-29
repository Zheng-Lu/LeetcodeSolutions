import java.util.Arrays;

public class DuplicateZeros {
    public static int[] duplicateZeros(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                // duplicate it!
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] array = {1,0,2,3,0,4,5,0};
        System.out.println(Arrays.toString(duplicateZeros(array)));

    }
}
