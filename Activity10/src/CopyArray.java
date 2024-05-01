import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class CopyArray{
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of array elements");
        final int elements = console.nextInt();
        int[] array1 = new int[elements];
        int[] array2 = new int[elements];
        int[] array3 = new int[elements];
        int[] array4 = new int[elements];

        System.out.println("Array 1");
        for (int i = 0; i < elements; i++){
            System.out.println("Enter array element " + i + ": ");
            array1[i] = console.nextInt();
        }
        System.out.println();
        System.out.println("Array 1");
        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("Array 2 - copy");
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        System.out.println("Array 3 - squared");
        for (int i = 0; i < array1.length; i++){
            array3[i] = array1[i] * array1[i];
            System.out.print(array3[i] + " ");
        }
        System.out.println();
        System.out.println("Array 4 - reversed");
        int i = array1.length - 1;
        for (int j = 0; j < array1.length; j++){
            array4[j] = array1[i];
            System.out.print(array4[j] + "  Stri");
            i -= 1;
        }
    }
}
