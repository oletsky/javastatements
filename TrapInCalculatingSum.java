package javatraining.oletsky.statements;

/**
 * @author O.Oletsky
 * This code has been designed for calculating a sum by using
 * a typical loop but there is a mistake in it. Try to fix it
 */

public class TrapInCalculatingSum {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i < 5; i++) {
            s += 1 / (i+1);
        }
        System.out.println(s);
    }

}
