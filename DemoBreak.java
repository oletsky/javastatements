package javatraining.oletsky.statements;

import java.util.Scanner;

/**
 * @author O.Oletsky
 * Illustrating break
 * Sum of positive ints. End is 0
 */
public class DemoBreak {
    public static void main(String[] args) {
        int s = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the next value");
            int n = scanner.nextInt();
            if (n == 0) break;
            s += n;
        }
        System.out.println("The sum is " + s);

    }
}
