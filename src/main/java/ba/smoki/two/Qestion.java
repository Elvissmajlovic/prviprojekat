package ba.smoki.two;

public class Qestion {
    public static void main(String[] args) {
        int number = 23;
        //ekspliciting iz veceg u manji
        short shortNumber = (short)number;
        //automatska iz manjeg u veci iz 32 u 64 bit
        long longNumber = number;
    }
}
