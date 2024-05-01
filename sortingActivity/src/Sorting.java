import java.util.Scanner;

public class Sorting {
    Scanner scanner = new Scanner(System.in);
    int[] array = new int[5];
    public int[] getArray(){
        for (int i = 0; i <= array.length-1; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            array[i] = Integer.parseInt(scanner.next());
        }
        return array;
    }
    public int[] sortArray(int[] array){
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int index = 0; index < array.length-1; index++) {
                if(array[index] > array[index + 1]){
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}
