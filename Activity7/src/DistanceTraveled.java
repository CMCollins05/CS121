import java.util.Scanner;

public class DistanceTraveled {
    public static void main(String[] args) {

        int speed, time, distance, i;
        Scanner userInput = new Scanner(System.in);

        System.out.println("How fast were you going?");
        speed = userInput.nextInt();
        System.out.println("How long were you traveling?");
        time = userInput.nextInt();

        System.out.println("Hour \tDistance");
        System.out.println("*******************");

        for (i = 1; i <= time; i++) {
            distance = i * speed;
            System.out.println("\t" + i + " \t\t" + distance);
        }
    }
}
