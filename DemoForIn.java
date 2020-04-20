package javatraining.oletsky.statements;

/**
 * Illustrating for-in loop
 * Calculation of sum
 */
public class DemoForIn {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int s=0;
        for (int i:nums) s+=i;
        System.out.println(s);

    }
}
