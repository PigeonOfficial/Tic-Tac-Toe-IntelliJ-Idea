import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = 3;
        int[] box1 = new int[n];
        int[] box2 = new int[n];
        int a = 0;
        int b = 0;

        for (int i = 0; i < n; i++) {
            box1[i] = scanner.nextInt();
        }
        Arrays.sort(box1);
        for (int i = 0; i < n; i++) {
            box2[i] = scanner.nextInt();
        }
        Arrays.sort(box2);

        for (int i = 0; i < n; i++) {
            if (box1[i] < box2[i]) {
                a++;
            } else if (box1[i] > box2[i]) {
                b++;
            }
        }
        if (a == 3) {
            System.out.print("Box 1 < Box 2");
        } else if (b == 3) {
            System.out.print("Box 1 > Box 2");
        } else {
            System.out.print("Incompatible");
        }
    }
}