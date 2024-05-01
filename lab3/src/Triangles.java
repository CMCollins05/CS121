import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {

        Scanner triangle = new Scanner(System.in);
        int side1, side2, side3;

        System.out.println("Enter the length of side 1");
        side1 = triangle.nextInt();
        System.out.println("Enter the length of side 2");
        side2 = triangle.nextInt();
        System.out.println("Enter the length of side 3");
        side3 = triangle.nextInt();

        if (side1 == side2 && side2 == side3){
            System.out.println("You have an equilateral triangle");
        }
        else if(side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("You have an isoceles triangle");
        }
        else{
            System.out.println("You have a scalene triangle");
        }
    }
}
