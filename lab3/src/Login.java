import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        String userName = "Ace";
        String password = "Password";
        String name, pass;

        name = JOptionPane.showInputDialog("Enter your username");
        pass = JOptionPane.showInputDialog("Enter your password");

        if(name.equals(userName)){
            if(pass.equals(password)){
                JOptionPane.showMessageDialog(null,"Welcome to CS121");
            }
            else{
                JOptionPane.showMessageDialog(null, "Password is incorrect");
            }
        }
        else if(pass.equals(password)){
            JOptionPane.showMessageDialog(null, "Username is incorrect");
        }
        else{
            JOptionPane.showMessageDialog(null, "Both inputs are incorrect");
        }



    }
}
