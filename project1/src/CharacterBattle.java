import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {

        int rounds;
        String player1, player2;
        int hp1, hp2;
        String move1, move2;
        int power1, power2;
        double speed1, speed2;
        int wins1 = 0, wins2 = 0;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of rounds");
        rounds = userInput.nextInt();
        if (rounds % 2 == 0) {
            rounds += 1;
        }

        while (rounds > 0) {
            System.out.println("Player 1 enter your animal");
            player1 = userInput.next();
            System.out.println("Enter the HP");
            hp1 = userInput.nextInt();
            System.out.println("Enter the name of the move");
            move1 = userInput.next();
            System.out.println("Enter the damage of the move");
            power1 = userInput.nextInt();
            System.out.println("Enter the speed of the move");
            speed1 = userInput.nextInt();

            System.out.println("Player 2 enter your animal");
            player2 = userInput.next();
            System.out.println("Enter the HP");
            hp2 = userInput.nextInt();
            System.out.println("Enter the name of the move");
            move2 = userInput.next();
            System.out.println("Enter the damage of the move");
            power2 = userInput.nextInt();
            System.out.println("Enter the speed of the move");
            speed2 = userInput.nextInt();

            if (speed1 > speed2) {
                while (hp1 > 0 && hp2 > 0) {
                    hp2 = hp2 - power1;
                    hp1 = hp1 - power2;
                }
                if (hp2 <= 0) {
                    wins1++;
                    System.out.println("Round winner: " + player1 + " with " + move1);
                } else {
                    wins2++;
                    System.out.println("Round winner: " + player2 + " with " + move2);
                }
            } else if (speed2 > speed1) {
                while (hp1 > 0 && hp2 > 0) {
                    hp1 = hp1 - power2;
                    hp2 = hp2 - power1;
                }
                if (hp1 <= 0) {
                    wins2 += 1;
                    System.out.println("Round winner: " + player1 + " with " + move1);
                } else {
                    wins1 += 1;
                    System.out.println("Round winner: " + player2 + " with " + move2);
                }
            } else if (Math.random() * 2 >= 1) {
                    while (hp1 > 0 && hp2 > 2) {
                        hp2 = hp2 - power1;
                        hp1 = hp1 - power2;
                    }
                    if (hp2 <= 0) {
                        wins1++;
                        System.out.println("Round winner: " + player1 + " with " + move1);
                    } else {
                        wins2++;
                        System.out.println("Round winner: " + player2 + " with " + move2);
                    }
            } else {
                while (hp1 > 0 && hp2 > 2) {
                    hp2 = hp2 - power1;
                    hp1 = hp1 - power2;
                }
                if (hp2 <= 0) {
                    wins1++;
                    System.out.println("Round winner: " + player1 + " with " + move1);
                } else {
                    wins2++;
                    System.out.println("Round winner: " + player2 + " with " + move2);
                }
            }
            rounds -= 1;
        }
        if (wins1 > wins2) {
            System.out.println("Player 1 wins the battle");
        } else {
            System.out.println("Player 2 wins the battle");
        }
        System.out.println("Player 1 wins: " + wins1);
        System.out.println("Player 2 wins: " + wins2);
    }
}

