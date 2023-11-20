package ba.smoki.thre.operators;

/**
 * <p>
 *     Unarni operatori
 *     <li> + </li>
 *     <li> - </li>
 *     <li> ++ </li> pre i post
 *     <li> -- </li>
 *     <li> ! logički komplement operator </li>
 * </p>
 */

public class UnaryDemo {
    public static void main(String[] args) {
        int number = +23;
        System.out.println(number);
        number = -23;
        System.out.println(number);
        number++;
        System.out.println(number++);
        number  = 23;
       ++ number;
        System.out.println(number + ">");
        number = 23;
        System.out.println(++number + "<");
        System.out.println( number);











    }
}
