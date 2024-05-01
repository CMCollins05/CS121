import java.util.Scanner;

public class MovieSimulationOne {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        final int size;

        System.out.println("How many movie details would you like to enter?");
        size = console.nextInt();
        String[] movieNames = new String[size];
        String[] movieType = new String[size];
        int[] movieAvailability = new int[size];
        double[] moviePrices = new double[size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter the movie name");
            movieNames[i] = console.next();
            System.out.println("Enter the type of movie");
            movieType[i] = console.next();
            System.out.println("Enter the number of available seats");
            movieAvailability[i] = console.nextInt();
            System.out.println("Enter the cost of the movie ticket");
            moviePrices[i] = console.nextDouble();
        }
        printArrays(movieNames, movieType, movieAvailability, moviePrices);
    }
    public static void printArrays(String[] movieNames, String[] movieType, int[] movieAvailability, double[] moviePrices) {
        System.out.println("---------------Movie Details---------------");
        System.out.println("Movie name       Movie Type          Available Seats          Movie price");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.printf("Movie: %-20s %-20s %-20d $%-20.2f\n", movieNames[i], movieType[i], movieAvailability[i], moviePrices[i]);
        }
    }
}
