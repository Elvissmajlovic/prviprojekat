package ba.smoki.four.array;

/**
 * int[] number = new int [3]
 *
 * 23  10  36
 * -    -   -
 * 0    1    2   niz od 3 broja
 *
 * ---   ---   --
 * 0      1     2    niz od 3 niza brojeva
 */
public class MultioinArrayDemo {
    public static void main(String[] args) {
        int[][] multionArray = new int[3][2];
        //prva zagrada govori koliko imammo nizova
        //druga zagrada govori koliko je brojeva u nizu
        multionArray[0][0] = 23;
        multionArray[0][1] = 10;
        multionArray[1][0] = 111;
        multionArray[1][1] = 243;
        multionArray[2][0] = 10;
        multionArray[2][1] = 14;
        
               }
}
