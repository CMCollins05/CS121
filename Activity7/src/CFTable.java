public class CFTable {
    public static void main(String[] args) {
        int c;
        double f;

        System.out.println("Celsius \tFahrenheit");
        System.out.println("*******************");

        for (c = 0; c <= 20; c++) {
            f = (9.0/5) * c + 32;
            System.out.printf("\t" + c + " \t\t%.1f", f);
            System.out.println();
        }
    }
}
