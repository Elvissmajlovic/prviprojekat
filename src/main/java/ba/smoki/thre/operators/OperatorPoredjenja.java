package ba.smoki.thre.operators;

import java.util.Scanner;

/**
 * <p>
 *  <li> == equal to</li>
 *  <li> ! not equal to</li>
 *  <li> > greater than </li>
 *  <li> < </li>
 *  <li> <=  >= </=></li>
 * </p>
 */

public class OperatorPoredjenja {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        int number2 = new Scanner(System.in).nextInt();
       // boolean rezultat = number1 == number2;
        if (number1 ==number2){
            System.out.println("Uneseni brojevi su jednaki");
        }
        if (number1 != number2){
            System.out.println("Uneseni brojevi su nejednaki");
        }
        if (number1>number2){
            System.out.println("Prvi broj je veći od drugog");
        }
        if (number1>=number2){
            System.out.println("Prvi broj je veći ili jednak drugom broju");
        }
        if (number1<number2){
            System.out.println("Prvi broj je manju od drugog");
        }
        if (number1<=number2){
            System.out.println("Prvi broj je manji ili jednak drugom broju");
        }


    }
}
