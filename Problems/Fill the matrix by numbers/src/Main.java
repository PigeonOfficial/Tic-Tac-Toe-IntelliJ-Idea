import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int[][] array = new int [input][input];
        int current = 0;

        for (int i = 0; i < input; i++) {
            for (int g = i+0; g < input; g++) {
                array[i][g] = current;
                current++;
            }
            current = 0;
        }

        for (int i = input -1; i > 0; i--) {
            for (int g = i; g >= 0; g--) {
                array[i][g] = current;
                current++;
            }
            current = 0;
        }

        for (int i = 0; i < input; i++) {
            for (int g = 0; g < input; g++) {
                System.out.print(array[i][g] + " ");
            }
            System.out.println();
        }
    }
}