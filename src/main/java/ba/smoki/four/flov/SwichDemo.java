package ba.smoki.four.flov;

import javax.swing.*;

/**
 * Zadatak, imate tastaturu od 7 broojva,
 * Vas malac moze stisnuti 1 od tih 7 brojeva.
 * 1 2 3 4 5 6 7
 *kada god prtisnu broj iskoci naziv dana u sedmici
 * example
 * 3 -- "Mitwcoh",
 * 4 -- "Donerstag"
 * 6-- " Samstag"
 * 7 -- "Soontag"
 */
public class SwichDemo {
    public static void main(String[] args) {
        String unos = JOptionPane.showInputDialog("Unesi redni broj dana u sedmici");
        int weekDayNummber = Integer.parseInt(unos);
        // integer služi uzmi ovaj unos i prebaci mi u broj
        String weekDayName;

        switch (weekDayNummber){
            case 1:
                weekDayName = "Moontag";
                break;
            case 2:
                weekDayName = "Dienstag";
                break;
            case 3:
                weekDayName = "Mitwoch";
                break;
            case 4:
                weekDayName = "Doonerstag";
                break;
            case 5:
                weekDayName = "Freitag";
                break;
            case 6:
                weekDayName = "Samstag";
                break;
            case 7:
                weekDayName = "Sontag";
                break;
            default :
                weekDayName = " Keine Day";
                break;
        }
JOptionPane.showMessageDialog(null, weekDayName);

    }
}
