import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorting array = new Sorting();
        int[] test = array.getArray();
        System.out.println("Unsorted Array: " + Arrays.toString(test));
        int[] sort = array.sortArray(test);
        System.out.println("Sorted Array: " + Arrays.toString(sort));
    }
}
