/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package us.fiestaboleana.programacionuno;

import us.fiestaboleana.programacionuno.objects.student.Student;
import us.fiestaboleana.programacionuno.objects.student.StudentBuilder;

public class ProgramacionUno {

    public static void main(String[] args) {
        Student student = StudentBuilder.fromDetailedPanel();
    }
}
