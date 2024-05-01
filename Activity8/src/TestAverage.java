import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {

        int students, tests, scores = 0;
        Double average;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of students");
        students = userInput.nextInt();

        System.out.println("Enter the number of tests");
        tests = userInput.nextInt();

        for (int i = 1; i <= students; i++){
            scores = 0;
            for (int j = 1; j <= tests; j++){
                System.out.println("Enter score number " + j + " for student number " + i);
                scores += userInput.nextInt();
            }
            average = (double) scores / tests;
            System.out.printf("The average for student number " + i + " is %.2f", average);
            System.out.println("");
        }

    }
}
