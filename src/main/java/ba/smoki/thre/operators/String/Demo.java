package ba.smoki.thre.operators.String;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        String ime = JOptionPane.showInputDialog("Unesi svoje ime");
        String prezime = JOptionPane.showInputDialog("Unesite svoje prezime");
        String otac = JOptionPane.showInputDialog("unesite ime svoga oca");
        String result = ime + prezime;
        String formattedResult = ime + " "+prezime;
        String fullName = prezime + " " + "("+ otac + ")"+ " " + ime;
        JOptionPane.showMessageDialog(null, fullName);

    }
}
