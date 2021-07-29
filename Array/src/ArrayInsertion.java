public class ArrayInsertion {
    public static void main(String[] args) {

        // Declare an integer array of 6 elements
        int[] intArray = new int[6];
        int length = 0;

        // Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }

        /*
        Inserting at the End of an Array
        */

        intArray[length] = 10;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        /*
        Inserting at the Start of an Array
        */

        // First, we will have to create space for a new element.
        // We do that by shifting each element one index to the right.
        // This will firstly move the element at index 3, then 2, then 1, then finally 0.
        // We need to go backwards to avoid overwriting any elements.
        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }

        // Now that we have created space for the new element,
        // we can insert it at the beginning.
        intArray[0] = 20;

        System.out.println("");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

        /*
        Inserting Anywhere in the Array
        */
        for (int i = 4; i >=0 ; i--) {
            intArray[i + 1] = intArray[i];
        }

        intArray[1] = 100;

        System.out.println("");

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

    }
}
