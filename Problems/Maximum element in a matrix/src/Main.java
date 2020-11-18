import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arrays = new int[a][b];
        int column = 0;
        int row = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arrays[i][j] = scanner.nextInt();
                if (arrays[i][j] > arrays[column][row]) {
                    column = i;
                    row = j;
                }
            }
        }
        System.out.println(column + " " + row);
    }
}