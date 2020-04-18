package javatraining.oletsky.statements;

/**
 * @author O.Oletsky
 * Forget about Math.pow() for small integers - it is very ineffective.
 * Here is a function for calculating integer powers of ints
 * Thanks to Volodymyr Boublik
 */

public class IntegerPow {
    public static void main(String[] args) {
        int a=2;
        int n=62;
        try {
            long r=intPow(a,n);
            System.out.println(r);
        }
        catch (RuntimeException e) {
            System.out.println("Overflow Error");
        }

        //For test only
        System.out.println(Math.pow(a,n));
    }

    static long intPow(int base, int n){
        long b=base;
        if (b<0||n<0) throw new IllegalArgumentException("Negative arguments");
        if (b==0&&n==0) throw new IllegalArgumentException("Both arguments are 0");
        if (b==0) return 0;
        if (n==0||b==1) return 1;
        long res=1;
        while (n>0) {
            if ((n&1)==0) {
                n>>=1;
                b*=b;
                if (b<=0) throw new RuntimeException("Overflow error");
                }
            else {
                n--;
                res*=b;
                if (res<=0) throw new RuntimeException("Overflow error");
                }
        }
        return res;
    }
}
