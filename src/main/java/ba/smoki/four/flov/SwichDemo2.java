package ba.smoki.four.flov;

import javax.swing.*;
import java.util.Locale;

public class SwichDemo2 {
    public static void main(String[] args) {
        String WeekDayName = JOptionPane.showInputDialog("Unesi ime dane u sedmici na Njemačkom");
        String WeekDayNativeName;
        switch (WeekDayName.toLowerCase(Locale.ROOT)) {
            case "montag":
                    WeekDayNativeName = "Ponedjeljak" ;
                     break;
            case "dienstag":
                WeekDayNativeName = "Utorak";
                break;
            case "ditwoch":
                WeekDayNativeName = "Utorak";
                break;
            case "donersat":
                WeekDayNativeName = "Četvrtak";
                break;
            case "freitag":
                WeekDayNativeName = "Petak";
                break;
            case "samstag":
                WeekDayNativeName = "Subota";
                break;
            case "sontag":
                WeekDayNativeName = "Nedjelja";
                break;
            default:
                WeekDayNativeName = "Ponovite unos";




        }
        JOptionPane.showMessageDialog(null, WeekDayNativeName);
}
    }
