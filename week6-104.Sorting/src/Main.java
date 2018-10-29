
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        // indexes:    0  1  2  3   4
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
        System.out.println(Arrays.toString(values));
    }

    public static int smallest(int[] array) {
        int smallestValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }

    public static int indexOfTheSmallest(int[] array) {
        int smallestValue = smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestValue) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        //get index of smallet
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int indexOfSmallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, indexOfSmallest, i);
        }

    }

}
