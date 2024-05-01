import javax.swing.*;

public class JOptionPaneWordGame {
    public static void main(String[] args) {

        String name;
        int age;
        String city;
        String college;
        String major;
        String animal;
        String petName;

        name = JOptionPane.showInputDialog("What is your name?");
        age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        city = JOptionPane.showInputDialog("What city do you live in?");
        college = JOptionPane.showInputDialog("What college do you go to?");
        major = JOptionPane.showInputDialog("What are you majoring in?");
        animal = JOptionPane.showInputDialog("What is your favorite animal?");
        petName = JOptionPane.showInputDialog("What is the name of your pet?");

        JOptionPane.showMessageDialog(null, String.format("There once was a person named " + name + " who lived in " + city + ". At the age of " + age + ", they went to " + college + ". They graduated with a major in " + major + ". Then " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!"));
    }
}
