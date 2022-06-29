/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package us.fiestaboleana.programacionuno.exercises;

import us.fiestaboleana.programacionuno.libraries.ScannerLib;

public class Matematico {
    public Matematico() {
        System.out.println("¿Que deseas realizar?");
        System.out.println("SUMAR, RESTAR, MULTIPLICAR, DIVIDIR");
        String input = ScannerLib.scanString("");
        String superInput = input.toLowerCase();
        switch (superInput) {
            case "sumar" -> {
                int x = ScannerLib.scanInt("Introduzca el primer número");
                int y = ScannerLib.scanInt("Introduzca el segundo número");
                System.out.println("Total: " + add(x, y));
            }
            case "restar" -> {
                int x = ScannerLib.scanInt("Introduzca el primer número");
                int y = ScannerLib.scanInt("Introduzca el segundo número");
                System.out.println("Total: " + subtract(x, y));
            }
            case "multiplicar" -> {
                int x = ScannerLib.scanInt("Introduzca el primer número");
                int y = ScannerLib.scanInt("Introduzca el segundo número");
                System.out.println("Total: " + multiply(x, y));
            }
            case "dividir" -> {
                int x = ScannerLib.scanInt("Introduzca el dividendo");
                int y = ScannerLib.scanInt("Introduzca el divisor");
                System.out.println("Total: " + divide(x, y));
            }
            default -> {
                System.out.println(superInput + " no es válido");
                System.out.println("Comandos válidos:");
                System.out.println("SUMAR, RESTAR, MULTIPLICAR, DIVIDIR");
            }
        }
        String again = ScannerLib.scanString("¿Desea realizar otra operación?");
        String tl = again.toLowerCase();
        if (tl.equals("si") || tl.equals("continuar"))
            new Matematico();

    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int numerator, int denominator) {
        return (double) numerator / (double) denominator;
    }
}
