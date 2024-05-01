import javax.swing.*;

public class TestScores {
    public static void main(String[] args) {
        char letterGrade;
        int test1;
        int test2;
        int test3;
        double average;

        test1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first test score"));
        test2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second test score"));
        test3 = Integer.parseInt(JOptionPane.showInputDialog("Enter the third test score"));

        average = ((test1 + test2) + test3)/3.0;

        if(average >= 90){
            letterGrade = 'A';
        }
        else if(average >= 80){
            letterGrade = 'B';
        }
        else if(average >= 70){
            letterGrade = 'C';
        }
        else if(average >= 60){
            letterGrade = 'D';
        }
        else{
            letterGrade = 'F';
        }

        JOptionPane.showMessageDialog(null,String.format("The average is: %.2f\nThe letter grade is %c",average,letterGrade));
    }
}
