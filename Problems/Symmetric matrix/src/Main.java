import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = null;
        int  n = scanner.nextInt();
        int [][] matrix = new int[n][n];
        for (int row = 0; row < matrix.length; row++){
            for (int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    res = "NO";
                    System.out.println(res);
                    break;
                }
                else if (matrix[i][j] == matrix[j][i]) {
                    System.out.println(res);
                    res = "YES";
                }
            }
        }
        System.out.println(res);
    }
}