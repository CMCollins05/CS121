import java.util.Scanner;
public class Rectangle {
    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        console.close();
    }
    public static double getLength(){
    System.out.print("Enter the length of the rectangle: ");
        return console.nextDouble();
    }
    public static double getWidth(){
        System.out.print("Enter the width of the rectangle: ");
        return console.nextDouble();
    }
    public static double getArea(double length, double width){
        return length * width;

    }
    public static void displayData(double length, double width, double area){
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area);
    }
}
