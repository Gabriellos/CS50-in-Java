import java.util.Scanner;
import java.lang.Math;
public class Credit {
    private static int AMEX = 15;
    private static int MASTERCARD  = 16;
    private static int VISA_1 = 13;
    private static int VISA_2 = 16;
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        long Number = sc.nextLong();
        sc.close();
        answer(Number);
    }
public static void answer(Long s) {
        int i = 0;
        int total = 0;
        int totalOdd = 0;
        int totalEven = 0;
        int firstDigit = 0;
        int firstTwoDigits = 0;
        while (s > 1) {
            i++;
            if (s>=10 && s<=99) firstTwoDigits = Math.toIntExact(s);
            if (s<10) firstDigit = Math.toIntExact(s);
            int reminder = Math.toIntExact(s % 10);
            s /= 10;
            if (i % 2 == 0) {
                int even = reminder*2;
                if (even >= 10) {
                    even = (even % 10) + (even / 10);
                }
                totalEven += even;
            }
            else totalOdd += reminder;
        }
        total = (totalEven + totalOdd) % 10;
        if (total == 0) {
            if (i == AMEX && (firstTwoDigits == 34 || firstTwoDigits == 37)) System.out.print("AMEX");
            else if (i == MASTERCARD && firstTwoDigits >= 51 && firstTwoDigits <= 55) System.out.print("MASTERCARD");
            else if ((i == VISA_1 || i == VISA_2) && firstDigit == 4) System.out.print("VISA");
            else System.out.print("INVALID");
        }
        else System.out.print("INVALID");
    }
}
