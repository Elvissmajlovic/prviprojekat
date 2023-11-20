package ba.smoki.four.flov;

import javax.swing.*;

/*
 *vaš omiljeni profesor pregleda zadatke i fokusira se na to da vas da vam
 *  da precizno odgovarajuci broj poena na ispitu kako greškom ne bi oštetio
 * vas da vam da 8 iako ste ostvarii broj poena za 7
 * vi ćete mu olakšati tako što ćete kreirati program
 * koji ce mu ponuditi mogućnost da unese ostvareni broj poena
 * a vaš program će reći koja je to ocjena na ispitu
 */
public class IfElseDemo {
    public static void main(String[] args) {
        String profinUnos = JOptionPane.showInputDialog("Unesite broj poena koje je studen ostvario na ispitu");
        int brojPoena = Integer.parseInt(profinUnos);
        // A(10), B(9) C(8) D(7) E (6) F(5)
        char ocjena;
        if (brojPoena>=90){
            ocjena = 'A';


        }


    }
}
