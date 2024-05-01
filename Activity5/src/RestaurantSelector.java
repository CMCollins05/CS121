import java.util.Scanner;

public class RestaurantSelector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vegetarian, vegan, gluten;

        System.out.println("Is there anybody that is vegetarian?");
        vegetarian = scanner.nextLine().toLowerCase();
        System.out.println("Is there anybody that is vegan?");
        vegan = scanner.nextLine().toLowerCase();
        System.out.println("Is there anybody that is gluten-free?");
        gluten = scanner.nextLine().toLowerCase();

        System.out.println("Here are your restaurant choices:");
        if(vegetarian.equals("yes")){
            if(vegan.equals("yes")){
                if(gluten.equals("yes")){
                    System.out.println("Corner Cafe");
                    System.out.println("The Chef's Kitchen");
                }
                else{
                    System.out.println("Corner Cafe");
                    System.out.println("The Chef's Kitchen");
                }
            }
            else if(gluten.equals("yes")){
                System.out.println("Corner Cafe");
                System.out.println("Main Street Pizza Company");
                System.out.println("The Chef's Kitchen");
            }
            else{
                System.out.println("Main Street Pizza Company");
                System.out.println("Mama's Fine Italian");
                System.out.println("Corner Cafe");
                System.out.println("The Chef's Kitchen");
            }
        }
        else if(vegan.equals("yes")){
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");
            }
        else if(gluten.equals("yes")){
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Cafe");
            System.out.println("The Chef's Kitchen");
            }
        else{
            System.out.println("Joe's Gourmet Burgers");
            System.out.println("Main Street Pizza Company");
            System.out.println("Corner Cafe");
            System.out.println("Mama's Fine Italian");
            System.out.println("The Chef's Kitchen");
        }
    }
}
