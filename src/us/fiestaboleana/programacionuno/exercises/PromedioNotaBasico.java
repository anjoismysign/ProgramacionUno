/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package us.fiestaboleana.programacionuno.exercises;

import us.fiestaboleana.programacionuno.libraries.ScannerLib;

public class PromedioNotaBasico {
    public PromedioNotaBasico() {
        System.out.println("Bienvenido estudiante.");
        String studentName = ScannerLib
                .scanString("Por favor, introduce tu nombre: ");
        int i = 0;
        int grade = 0;
        boolean shouldContinue;
        do {
            i++;
            int x = ScannerLib.scanInt("Ingrese nota");
            grade += x;
            String input = ScannerLib
                    .scanString("¿Desea ingresar otra nota?");
            shouldContinue = input.equalsIgnoreCase("si");
        } while (shouldContinue);
        int x = grade / i;
        System.out.println("Promedio de " + studentName + ": " + x);
    }
}
