package us.fiestaboleana.programacionuno.libraries;

import javax.swing.*;

public class PanelLib {

    public static int requestInteger(String message) {
        String input = requestString(message);
        int x = 0;
        try {
            x = Integer.parseInt(input);
            return x;
        } catch (NumberFormatException e) {
            System.out.println("");
            System.out.println("'" + input + "' no es un entero");
            System.out.println("Integer (entero): '-2147483648' hasta '2147483647'");
            System.out.println("Ejemplo de entero: 17");
            System.out.println("");
            return requestInteger(message);
        }
    }

    public static double requestDouble(String message) {
        String input = requestString(message);
        double x = 0;
        try {
            x = Double.parseDouble(input);
            return x;
        } catch (NumberFormatException e) {
            System.out.println("");
            System.out.println("'" + input + "' no es un numero decimal");
            System.out.println("Ejemplo de double (numero decimal): '3.14'");
            System.out.println("");
            return requestInteger(message);
        }
    }

    public static String requestString(String message) {
        String input = requestString("", message);
        return input;
    }

    public static String requestString(String title, String message) {
        String input = JOptionPane.showInputDialog(null, message, title, -1);
        return input;
    }

    public static void showMessage(String message) {
        showMessage("", message);
    }

    public static void showMessage(String title, String message) {
        JOptionPane.showMessageDialog(null, message, title, -1);
    }
}
