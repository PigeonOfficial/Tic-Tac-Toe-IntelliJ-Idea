import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        String[] array1 = new String[array.length];
        int rotate = scanner.nextInt();
        int s = 0;

        if (rotate > array.length) {
            rotate = rotate % array.length;
        }

        for (int i = 0; i < array1.length; i++) {
            s = (i + rotate) % array1.length;
            array1[s] = array[i];
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
}