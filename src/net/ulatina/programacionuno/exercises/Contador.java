/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.ulatina.programacionuno.exercises;

import net.ulatina.programacionuno.libraries.ScannerLib;

public class Contador {
    public Contador() {
        int roof = ScannerLib.scanInt("¿Hasta donde quiere contar?");
        System.out.println("");
        for (int i = 1; i <= roof; i++) {
            if (i == 1)
                System.out.println(i + " oveja");
            else
                System.out.println(i + " ovejas");
        }
    }
}
