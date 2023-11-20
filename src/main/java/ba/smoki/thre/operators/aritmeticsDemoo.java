package ba.smoki.thre.operators;

import javax.swing.*;

/**
 * Aritmetički operatori:
 * <li> Aditive + </li>
 * <li> Subtraction - </li>
 * <li> Multiplication * </li>
 * <li> Division / </li>
 * <li> Modulo % </li>
 */
public class aritmeticsDemoo {
    public static void main(String[] args) {
        //GUI
        String number1 = JOptionPane.showInputDialog("Unesi prvi broj");
        Double broj1 = Double.parseDouble(number1);
        String number2 = JOptionPane.showInputDialog("Unesi drugi broj");
        double broj2 = Double.parseDouble(number2);
        double suma = broj1 + broj2;
        JOptionPane.showMessageDialog(null, "Suma =" + suma);
        double razlika = broj1 - broj2;
        JOptionPane.showMessageDialog(null, "razlika =" + razlika);
        double product = broj1 * broj2;
        JOptionPane.showMessageDialog( null, "Proizvod =" + product);
        double division = broj2 / broj1;
        JOptionPane.showMessageDialog( null, "Dijeljenje =" + division);
        double modulo = broj1 % broj2;
        JOptionPane.showMessageDialog(null, "Modulo =" + modulo);






    }

}
