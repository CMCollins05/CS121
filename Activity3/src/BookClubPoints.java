import javax.swing.*;

public class BookClubPoints {
    public static void main(String[] args) {

        int booksPurchased;
        int points;

        booksPurchased = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of books purchased."));

        if(booksPurchased == 0){
            points = 0;
        }
        else if(booksPurchased == 1){
            points = 5;
        }
        else if(booksPurchased == 2){
            points = 15;
        }
        else if(booksPurchased == 3){
            points = 30;
        }
        else if(booksPurchased >= 4){
            points = 60;
        }
        else{
            points = -1;
        }

        JOptionPane.showMessageDialog(null,String.format("The books entered: %d\nThe points earned is: %d",booksPurchased,points));
    }
}
