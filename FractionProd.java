package javatraining.oletsky.statements;

/**
 * @author O.Oletsky
 * A very typical but however ineffective code
 */
public class FractionProd {

    public static void main(String[] args) {
        int n=5;
        double res=calcProd(n);
        System.out.println("The product is "+res);
    }

    static double calcProd(int n) {
        double prod=1.;
        for (int i=1; i<=n; i++) {
            prod*=i/(i+1.);
        }
        return prod;
    }
}