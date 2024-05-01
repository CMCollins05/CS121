import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        System.out.println("Enter a number 1-4");
        int house = user.nextInt();
        String name, color, animal, trait;

        switch(house){
            case 1:
                name = "Gryffindor";
                color = "Red";
                animal = "Lion";
                trait = "Brave";
                break;
            case 2:
                name = "Slytherin";
                color = "Green";
                animal = "Snake";
                trait = "Sneaky";
                break;
            case 3:
                name = "Ravenclaw";
                color = "Blue";
                animal = "Raven";
                trait = "Smart";
                break;
            case 4:
                name = "Hufflepuff";
                color = "Yellow";
                animal = "badger";
                trait = "Special";
                break;
                default:
                name = "";
                color = "";
                animal = "";
                trait = "";
                break;
        }
        System.out.println(name);
        System.out.println(color);
        System.out.println(animal);
        System.out.println(trait);
    }
}
