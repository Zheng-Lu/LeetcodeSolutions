import java.util.Arrays;

public class CheckDoubleExist {
    public boolean checkIfExist(int[] arr) {
        int[] arrdouble = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrdouble[i] = arr[i]*2;
        }
        Arrays.sort(arrdouble);
        for (int key:arr){
            if (Arrays.binarySearch(arrdouble, key) >= 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {20,4,10,3};
        Arrays.sort(array);
        System.out.println(Arrays.binarySearch(array, 10) >= 0);
    }
}
