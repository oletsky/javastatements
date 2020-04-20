package javatraining.oletsky.statements;

/**
 * Illustrating break with labels
 */
public class DemoBreaksWithLabels {
    public static void main(String[] args) {
        final int N = 5;
        String s = "";
        m: for (int i=0; i<N; i++)  {
            for (int j=0; j<N; j++) {
                s=s+i+j;
                if ((i==2)&&(j==1)) break m;
            }
        }
        System.out.println("The final string is " + s);

    }
}
