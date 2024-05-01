import javax.swing.*;

public class BattleCharacter {
    public static void main(String[] args) {

        int rounds;
        String player1, player2;
        int hp1, hp2;
        String move1, move2;
        int power1, power2;
        double speed1, speed2;
        int wins1 = 0, wins2 = 0;

        rounds = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rounds"));
        if(rounds % 2 == 0){
            rounds += 1;
        }
        while(rounds > 0){
            player1 = JOptionPane.showInputDialog("Player 1, enter your animal");
            hp1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the health of your animal"));
            move1 = JOptionPane.showInputDialog("Enter the name of your move");
            power1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the damage for the move"));
            speed1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the speed of the move"));

            player2 = JOptionPane.showInputDialog("Player 2, enter your animal");
            hp2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the health of your animal"));
            move2 = JOptionPane.showInputDialog("Enter the name of your move");
            power2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the damage for the move"));
            speed2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the speed of the move"));

            if(speed1 > speed2){
                hp2 = hp2 - power1;
                if(hp2 > 0){
                    hp1 = hp1 - power2;
                    if(hp1 > hp2){
                        wins1 += 1;
                        System.out.println("Round winner: " + player1 + " with " + move1);
                    }
                    else{
                        wins2 += 1;
                        System.out.println("Round winner: " + player2 + " with " + move2);
                    }
                }
                else{
                    if(wins1 > wins2){
                        System.out.println("Player 1 wins the battle");
                    }
                    else{
                        System.out.println("Player 2 wins the battle");
                    }
                    System.out.println("Player 1 wins: " + wins1);
                    System.out.println("Player 2 wins: " + wins2);
                }
            }
            else if(speed2 > speed1){
                hp1 = hp1 - power2;
                if(hp1 > 0){
                    hp2 = hp2 = power1;
                    if(hp1 > hp2){
                        wins1 += 1;
                        System.out.println("Round winner: " + player1 + " with " + move1);
                    }
                    else{
                        wins2 += 1;
                        System.out.println("Round winner: " + player2 + " with " + move2);
                    }
                }
                else{
                    if(wins1 > wins2){
                        System.out.println("Player 1 wins the battle");
                    }
                    else{
                        System.out.println("Player 2 wins the battle");
                    }
                    System.out.println("Player 1 wins: " + wins1);
                    System.out.println("Player 2 wins: " + wins2);
                }
            }
            else{
                if(Math.random() * 2 >= 1){
                    speed1 += 1;
                }
                else{
                    speed2 += 1;
                }

            }
            rounds -= 1;
        }
        JOptionPane.showMessageDialog(null, "Player 1 wins: ");
    }
}
