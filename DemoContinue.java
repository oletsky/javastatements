package javatraining.oletsky.statements;

import java.util.Scanner;

/**
 * @author O.Oletsky
 * Illustrating break
 * Sum of positive ints. End is 0. Negatives are ignored
 */
public class DemoContinue {
    public static void main(String[] args) {
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the next value");
            int n = scanner.nextInt();
            if (n == 0) break;
            if (n<0) continue;
            s += n;
        }
        System.out.println("The sum is " + s);

    }
}
