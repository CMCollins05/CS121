import java.util.Scanner;
public class MovieSimulationThree {
    public static void main(String[] args) {
        String[] movieNames = new String[]{"Jumanji", "matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = new String[]{"2D", "2D", "3D", "IMAX"};
        double[] moviePrices = new double[] {15.25,20.15,18.11,22.12};
        int[][] movieAvailability = new int[5][10];

        System.out.println("-----Movie Details-----");
        System.out.println("Movie                    Movie Type             Movie Price");
        displayMovieDetails(movieNames, movieTypes, moviePrices);
        int index = selectMovie(movieNames);
        displaySelectedMovie(movieNames, movieTypes, moviePrices, index);
        System.out.println("-----Initial Seats-----");
        System.out.println("Seating Availability: [1 = taken; 0 = free]");
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        System.out.println("-----Random Generated Seats-----");
        System.out.println("Seating Availability: [1 = taken; 0 = free]");
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    public static int selectMovie(String[] movieNames){
        int index = 0;
        Scanner console = new Scanner(System.in);
        String selectedMovie = "";
        while (selectedMovie.equals("")){
            System.out.println("Enter the name of the movie you wish to see");
            selectedMovie = console.nextLine();
            for(int i = 0; i < movieNames.length; i++){
                if(selectedMovie.equals(movieNames[i])){
                    index = i;
                } else {
                    System.out.println("Movie not found! Please try again.");
                    break;
                }
            }
        }
        return index;
    }
    public static void displaySelectedMovie(String[] movieNames, String[] movieTypes, double[] moviePrices, int index){
        System.out.println("Movie Selected     Movie Type     Movie Price");
        System.out.printf("%-20s %-20s $%-20.2f", movieNames[index], movieTypes[index], moviePrices[index]);
    }
    public static void setSeatAvailability(int[][] movieAvailability){
        char[] rowLabel = {'A', 'B', 'C', 'D', 'E'};
        //for(int i = 1; i <= movieAvailability[0].length; i++){
            //System.out.printf(" %d ", i);
        //}
        System.out.printf("\n%s", "-".repeat(20));
        for(int i = 0; i < movieAvailability.length; i++){
            System.out.printf(" %d ", i);
            System.out.printf("\n%c |", rowLabel[i]);
            for(int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = 0;
            }
        }
    }
    public static void displaySeatAvailability(int[][] movieAvailability){
        for(int i = 0; i < movieAvailability.length; i++){
            for(int j = 0; j < movieAvailability[i].length; j++){
                System.out.print(movieAvailability[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public static void randomizeAvailability(int[][] movieAvailability){
        for(int i = 0; i < movieAvailability.length; i++){
            for(int j = 0; j < movieAvailability[i].length; j++){
                movieAvailability[i][j] = (int)(Math.random() * 2);
            }
        }
    }
    public static void displayMovieDetails(String[] movieNames, String[] movieTypes, double[] moviePrices){
        for(int i = 0; i < movieNames.length; i++){
            System.out.printf("Movie " + (i+1) + ": %-20s %-20s $%-20.2f\n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }
}
