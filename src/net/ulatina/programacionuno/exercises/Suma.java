/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.ulatina.programacionuno.exercises;

import net.ulatina.programacionuno.libraries.ScannerLib;

import java.util.Collections;

public class Suma {
    public Suma() {
        System.out.println("Bienvenido al programa que suma");
        System.out.println("");
        int x = ScannerLib.scanInt(Collections.singletonList("Ingrese el primer"
                + " número: "));
        System.out.println("");
        int y = ScannerLib.scanInt(Collections.singletonList("Ingrese el segundo"
                + " número: "));
        System.out.println("add: " + Matematico.add(x, y));
    }
}
