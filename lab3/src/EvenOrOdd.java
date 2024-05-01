import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        int input;
        Scanner number = new Scanner(System.in);

        System.out.println("Please enter a number");
        input = number.nextInt();

        if (input%2 == 0){
            System.out.println("You entered an even number");
        }
        else{
            System.out.println("You entered an odd number");
        }


    }
}
