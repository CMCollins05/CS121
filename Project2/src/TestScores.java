import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        final int size = (int) (Math.random() * 7) + 3;

        int[] scores = new int[size];
        char[] letterGrades = new char[size];

        System.out.println("Enter your " + size + " test scores");
        for(int i = 1; i <= size; i++){
            System.out.println("Enter test " + i + " score");
            scores[i-1] = console.nextInt();
        }
        for(int i = 0; i < size; i++){
            letterGrades[i] = getLetterGrade(scores[i]);
        }
        printGrades(scores, letterGrades);
        printHighest(scores);
        printLowest(scores);
        printAverage(scores);
        console.close();
    }
    public static char getLetterGrade(int scores){
        if(scores < 60){
            return 'F';
        }else if(scores < 70){
            return 'D';
        }else if(scores < 80){
            return 'C';
        }else if(scores < 90){
            return 'B';
        }else{
            return 'A';
        }
    }
    public static void printGrades(int[] scores, char[] letterGrades){
        System.out.println("Score     Grade");
        for(int i = 0; i < scores.length; i++){
            System.out.println("  " + scores[i] + "        " + letterGrades[i]);
        }
    }
    public static void printHighest(int[] scores){
        int temp = 0;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] > temp){
                temp = scores[i];
            }
        }
        System.out.println("The highest score is " + temp);
    }
    public static void printLowest(int[] scores){
        int temp = 100;
        for(int i = 0; i < scores.length; i++){
            if(scores[i] < temp){
                temp = scores[i];
            }
        }
        System.out.println("The lowest score is " + temp);
    }
    public static void printAverage(int[] scores){
        int total = 0;
        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        double average = (double) total / scores.length;
        System.out.printf("The average score is %.1f", average);
    }
}
