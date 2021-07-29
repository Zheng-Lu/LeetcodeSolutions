public class ArrayDeletion {
    public static void main(String[] args) {
        // Declare an integer array of 10 elements.
        int[] intArray = new int[10];

        // The array currently contains 0 elements
        int length = 0;

        // Add elements at the first 6 indexes of the Array.
        for(int i = 0; i < 6; i++) {
            intArray[length] = i;
            length++;
        }

        /*
        Deletion from the end is as simple as reducing the length
        of the array by 1.
         */
        length--;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        System.out.println("");

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        /*
        Deleting From the Start of an Array
         */

        // Starting at index 1, we shift each element one position
        // to the left.
        for (int i = 1; i < length; i++) {
            // Shift each element one position to the left
            intArray[i - 1] = intArray[i];
        }

        // Note that it's important to reduce the length of the array by 1.
        // Otherwise, we'll lose consistency of the size. This length
        // variable is the only thing controlling where new elements might
        // get added.
        length--;

        System.out.println("");

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        /*
        Deleting From Anywhere in the Array
         */

        // Say we want to delete the element at index 2
        for (int i = 3; i < length; i++) {
            // Shift each element one position to the left
            intArray[i - 1] = intArray[i];
        }

        // Again, the length needs to be consistent with the current
        // state of the array.
        length--;

        System.out.println("");

        for (int i = 0; i < length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }
    }
}
