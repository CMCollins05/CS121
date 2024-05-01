public class TwoDArrays {
    public static void main(String[] args) {
        int array1[][] = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        double array2[][] = new double[4][3];
        array2[0][0] = 1.1;
        array2[0][1] = 2.2;
        array2[0][2] = 3.3;
        array2[1][0] = 4.4;
        array2[1][1] = 5.5;
        array2[1][2] = 6.6;
        array2[2][0] = 7.7;
        array2[2][1] = 8.8;
        array2[2][2] = 9.9;
        array2[3][0] = 10.0;
        array2[3][1] = 11.1;
        array2[3][2] = 12.2;
        String array3[][] = {{"Andy", "Bob", "Chase"},{"Devon", "Evan", "Ferris"}};
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array1[i].length; j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(double[] row: array2){
            for(double column : row){
                System.out.print(column + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(String[] row: array3){
            for(String column: row){
                System.out.print(column + " ");
            }
            System.out.println();
        }


    }
}
