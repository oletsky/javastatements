package javatraining.oletsky.statements;

/**
 * Unlike to C++ in Java this is the only situation
 * when such trick is possible at all
 */

public class TrueOrFalse {
    public static void main(String[] args) {
        boolean b=false;
        if (b=true) System.out.println("true");
        else System.out.println(false);
        //Which would be the output: true or false?
    }
}
