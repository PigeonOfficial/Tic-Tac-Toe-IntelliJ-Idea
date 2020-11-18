import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        //DIAGONALI
        int diagsx = 0;
        int diagdx = n - 1;

        String[][] matrix = new String [n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                //ORIZZONATALE
                if (i == n / 2) {
                    matrix[i][j] = "*";
                } //VERTICALE
                else if (j == n / 2) {
                    matrix[i][j] = "*";
                } else if (i == diagsx && j == diagsx) {
                    matrix[i][j] = "*";
                } else if (i == diagsx && j == diagdx) {
                    matrix[i][j] = "*";
                } else {
                    matrix[i][j] = ".";
                }
            }
            diagdx--;
            diagsx++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}