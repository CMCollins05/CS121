public class MovieSimulationTwo {
    public static void main(String[] args) {
        String[] movieNames = new String[]{"Jumanji", "matrix", "Star Wars", "Oppenheimer"};
        String[] movieTypes = new String[]{"2D", "2D", "3D", "IMAX"};
        double[] moviePrices = new double[] {15.25,20.15,18.11,22.12};
        int[][] movieAvailability = new int[5][10];

        System.out.println("-----Movie Details-----");
        System.out.println("Movie                    Movie Type             Movie Price");
        displayMovieDetails(movieNames, movieTypes, moviePrices);
        System.out.println("-----Initial Seats-----");
        System.out.println("Seating Availability: [1 = taken; 0 = free]");
        setSeatAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
        System.out.println("-----Random Generated Seats-----");
        System.out.println("Seating Availability: [1 = taken; 0 = free]");
        randomizeAvailability(movieAvailability);
        displaySeatAvailability(movieAvailability);
    }
    public static void setSeatAvailability(int[][] movieAvailability){
        for(int i = 0; i < movieAvailability.length; i++){
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
            System.out.printf("Movie: %-20s %-20s $%-20.2f\n", movieNames[i], movieTypes[i], moviePrices[i]);
        }
    }
}
