import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
//Code in a handcuff method
//Code dealer to be similar to player or make it player 2
//Code chamber size to be relative to round number
public class Buckshot {
    public static int playerHealth = 4;
    public static int dealerHealth = 4;
    public static boolean shoot = false;
    public static void main(String[] args) {
        ArrayList<Integer> chamber = new ArrayList<>();
        ArrayList<String> table = new ArrayList<>();
        Random chamberSize = new Random();
        System.out.println("Welcome to the game, 0's are blanks and 1's are live rounds, here are the moves");
        System.out.println("Shoot Self, Shoot Dealer, Smoke, Drink, Check Mag, Cut Barrel");
        System.out.println("Remember, Life isn't fair...");
        while(playerHealth > 0 && dealerHealth > 0){
            for(int i = 1; i <= 10; i++) {
                System.out.println("Round " + i);
                loadChamber(chamber, chamberSize);
                dealItems(table);
                dealItems(table);
                playerTurn(chamber, table);
                dealerTurn(chamber, table);
                System.out.println("Your health: " + playerHealth + "\nDealer Health: " + dealerHealth);
            }
        }
    }
    public static void playerTurn(ArrayList<Integer> chamber, ArrayList<String> table){
        Scanner haha = new Scanner(System.in);
        shoot = false;
        while(!shoot){
            //for(int i = 0; i<chamber.size();i++){
              //  System.out.print(chamber.get(i) + " ");
            //}
            System.out.println("Here are your items: " + table);
            System.out.println("Enter an action");
            String action = haha.nextLine();
            switch (action) {
                case "Drink":
                    if(table.contains("Drink")) {
                        drink(chamber);
                        table.remove("Drink");
                    }else{
                        System.out.println("You don't have a Drink");
                    }
                    playerTurn(chamber, table);
                    break;
                case "Smoke":
                    if(table.contains("Smoke")) {
                        smoke();
                        table.remove("Smoke");
                    }else{
                        System.out.println("You don't have a smoke");
                    }
                    playerTurn(chamber, table);
                    break;
                case "Check Mag":
                    if(table.contains("Check Mag")) {
                        checkMag(chamber);
                        table.remove("Check Mag");
                    }else{
                        System.out.println("You don't have a Check Mag");
                    }
                    playerTurn(chamber, table);
                    break;
                case "Saw":
                    if(table.contains("Saw")) {
                        saw(chamber);
                        table.remove("Saw");
                    }else{
                        System.out.println("You don't have a Saw");
                    }
                    break;
                case "Shoot Self":
                    shootPlayer(chamber, table);
                    break;
                case "Shoot Dealer":
                    shootDealer(chamber);
                    shoot = true;
                    break;
            }
        }
    }
    public static void dealerTurn(ArrayList<Integer> chamber, ArrayList<String> table){
        if(chamber.get(0) == 1){
            shootPlayer(chamber, table);
            System.out.println("The dealer shot you");
        }else{
            shootDealer(chamber);
            System.out.println("The dealer shot themselves");
        }
    }
    public static void smoke(){
        if(playerHealth < 4) {
            playerHealth++;
        }
    }
    public static void drink(ArrayList<Integer> chamber){
        System.out.println("Ejected shell was: " + chamber.get(0));
        chamber.remove(0);
    }
    public static void shootPlayer(ArrayList<Integer> chamber, ArrayList<String> table){
        if(chamber.get(0) == 1){
            playerHealth -= 1;
            shoot = true;
            chamber.remove(0);
        }else{
            System.out.println("Chamber was blank");
            chamber.remove(0);
        }
    }
    public static void shootDealer(ArrayList<Integer> chamber){
        if(chamber.get(0) == 1){
            dealerHealth -= 1;
            chamber.remove(0);
        }else{
            System.out.println("Chamber was blank");
            chamber.remove(0);
        }
    }
    public static void checkMag(ArrayList<Integer> chamber){
        System.out.println("Current shell is: " + chamber.get(0));
    }
    public static void saw(ArrayList<Integer> chamber){
        Scanner twoDamage = new Scanner(System.in);
        System.out.println("Shoot Player or Shoot Dealer?");
        String choice = twoDamage.nextLine();
        if(choice.equals("Shoot Player")){
            if(chamber.get(0) == 1){
                playerHealth -= 2;
            }else{
                System.out.println("Chamber was blank");
            }
        }else{
            if(chamber.get(0) == 1){
                dealerHealth -= 2;
            }else{
                System.out.println("Chamber was blank");
            }
        }
    }
    public static void loadChamber(ArrayList<Integer> chamber, Random chamberSize){
        for(int i = 0; i < chamberSize.nextInt(2, 9); i++){
            chamber.add(chamberSize.nextInt(0,2));
        }
    }
    public static void dealItems(ArrayList<String> table){
        Random items = new Random();
        int shit = items.nextInt(0,4);
        if(shit == 0){
            table.add("Smoke");
        }else if(shit == 1){
            table.add("Drink");
        }else if(shit == 2){
            table.add("Check Mag");
        }else{
            table.add("Saw");
        }
    }

}
