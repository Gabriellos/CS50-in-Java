import java.util.Scanner;
import java.lang.Math;
public class Cash {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        float cash;
        do {
            System.out.print("Change owned: ");
            cash = sc.nextFloat();
        }
        while (cash <= 0);
        sc.close();
        Change(cash);
    }

    public static void Change(final float Cash) {
        final int quarter = 25;
        final int dime = 10;
        final int nickel = 5;
        final int pennie = 1;
        int i = 0;
        int coins = Math.round(Cash * 100);
        while (coins >= quarter) {
            coins -= quarter;
            i++;
        }
        while (coins >= dime) {
            coins -= dime;
            i++;
        }
        while (coins >= nickel) {
            coins -= nickel;
            i++;
        }
        while (coins >= pennie) {
            coins -= pennie;
            i++;
        }
        System.out.print("The amount of coins is " + i);
    }
}