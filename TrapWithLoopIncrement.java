package javatraining.oletsky.statements;

/**
 * There is a mistake in this loop. Try to fix it
 */

public class TrapWithLoopIncrement {

    public static void main(String[] args) {
        for (int i=0; i<10; i=i++) {
            System.out.println(i);
        }

    }

}
