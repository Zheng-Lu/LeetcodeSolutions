import java.util.Arrays;
import java.util.Hashtable;

public class  SearchArray {

    public boolean checkIfExist(int[] arr) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        int[] arrdouble = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrdouble[i] = arr[i]*2;
        }
        for (int key:arr){
            if (Arrays.asList(arrdouble).contains(key)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {20,4,10,6};
        System.out.println(Arrays.asList(array).contains(10));
    }
}
