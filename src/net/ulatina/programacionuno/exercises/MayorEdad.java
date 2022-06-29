/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.ulatina.programacionuno.exercises;

import net.ulatina.programacionuno.libraries.ScannerLib;

import java.util.Collections;

public class MayorEdad {

    public MayorEdad() {
        int edad = ScannerLib.scanInt(Collections
                .singletonList("Ingrese su edad: "));
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
    }

}
