package ba.smoki.four.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int broj = 23;
        System.out.println(broj);
        broj = 10;
        System.out.println(broj);
        broj = 36;
        System.out.println(broj);
        //Prvi složeni tip podatka je niz
        /*
        1.Opcija ...  Zauzmem memorije koliko mi treba
        koliko polja ja u varijabli ja trebam ili koliko ću brojeva skladištiti u nizu

        brojevi ... u njoj mogu biti skladištena 3 broja int tipa

         */
        int[] brojevi = new int[3];
        brojevi[0] = 23;
        brojevi[1] = 10;
        brojevi[2] = 36;
        System.out.println("Element na indeksu 0=" + brojevi[0]);
        System.out.println("Element na indeksu 1=" + brojevi[1]);
        System.out.println("Element na indeksu 2=" + brojevi[2]);

        /*
        drugi način kreiranja niza

         */
        int[] numbers = {23,10,36};





    }
}
