import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int counter = 0, num, numGuess;
        String guess;
        Scanner userInput = new Scanner(System.in);
        num = (int) (Math.random() * 99) + 1;

        System.out.println("Enter a number between 1 - 100, or 'q' to quit");
        guess = userInput.next();

        while(!guess.equals("q")){
            numGuess = Integer.parseInt(guess);
            counter ++;
            if(numGuess == num){
                System.out.println("That's correct!");
                System.out.println("Number of guesses: " + counter);
            }
            else if(numGuess > num){
                System.out.println("That guess was too high");
            }
            else if(numGuess < num){
                System.out.println("That guess was too low");
            }
            guess = userInput.next();
        }
        if(guess.equals("q")){
            System.out.println("The number was: " + num);
            System.out.println("Goodbye!");
        }
    }
}
