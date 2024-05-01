import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] professor = new String[4];
        String[] subject = new String[4];
        int[] grade = new int[4];

        for (int i = 0; i < 4; i++){
            System.out.print("Enter the professor's name: ");
            professor[i] = console.next();
            System.out.print("Enter the subject: ");
            subject[i] = console.next();
            System.out.print("Enter your number grade: ");
            grade[i] = console.nextInt();
            System.out.println();
        }

        System.out.printf("%-18s %s\n", "Professor & Subject", "Grade");

        for (int i = 0; i < professor.length; i++){
            System.out.printf("%-18s %d\n", professor[i] + " " + subject[i], grade[i]);
        }
    }
}
