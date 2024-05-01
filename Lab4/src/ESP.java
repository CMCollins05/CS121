import java.util.Scanner;
import java.util.Random;

public class ESP {
    public static void main(String[] args) {

        int color, counter = 0;
        String user, colorWord = "";

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            System.out.println("What color did the computer pick? Red, Green, Blue, Orange, or Yellow?");
            user = scanner.nextLine();

            color = rand.nextInt(4);
            if(color == 0){
                colorWord = "Red";
            }
            else if(color == 1){
                colorWord = "Green";
            }
            else if(color == 2){
                colorWord = "Blue";
            }
            else if(color == 3){
                colorWord = "Orange";
            }
            else if(color == 4){
                colorWord = "Yellow";
            }

            System.out.println("You guessed: " + user);
            System.out.println("The computer picked: " + colorWord);
            if(user.equals("Red") && color == 0){
                counter += 1;
            }
            else if(user.equals("Green") && color == 1){
                counter += 1;
            }
            else if(user.equals("Blue") && color == 2){
                counter += 1;
            }
            else if(user.equals("Orange") && color == 3){
                counter += 1;
            }
            else if(user.equals("Yellow") && color == 4){
                counter += 1;
            }

        }
        System.out.println("You won " + counter + " times.");
    }
}
