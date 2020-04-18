package javatraining.oletsky.statements;

/**
 * @author O.Oletsky
 * It is a program for finding an element in an array, and
 * it's a tribute to fans of structural programming.
 * It works but we can make it more smart and concise by using break
 */

public class RefactorFindToBreak {

    public static void main(String[] args) {

        int[] mas={25, 20, 8, 17, 4, 10};

        //Finding index
        int ind=-1;

        int i=0;
        boolean exit=false;

        int fnd=8;

        while (!exit&&(i<mas.length)) {
            if (mas[i]==fnd) {
                ind=i;
                exit=true;
            }
            else i++;


        }

        //Results
        if (ind==-1) System.out.println("Element "+fnd+" not found");
        else System.out.println("Index of "+fnd+" is "+ind);

    }

}
