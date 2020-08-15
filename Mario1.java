import java.util.Scanner;
public class Mario1 {
    public static void main(final String[] args) {
        var scanner = new Scanner(System.in);
        int height;
        do {
            height = scanner.nextInt();
        } while (height <= 0 || height >= 20);
        scanner.close();

        for (int i = 1; i <= height; i++) {
            for (int k = height - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
