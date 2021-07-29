public class ReplaceElemWithGreatestElemR {
    public int[] replaceElements(int[] arr) {
        if (arr.length <=1) {
            arr[0] = -1;
            return arr;
        }

        int max = 0;

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j =i+1; j < arr.length; j++) {
                if (arr[j]>max){
                    max = arr[j];
                }
            }
            arr[i]=max;
            max = 0;
            if (arr[arr.length-1] == arr[arr.length-2]){
                arr[arr.length-1] =-1;
            }
        }

        return arr;
    }
}
