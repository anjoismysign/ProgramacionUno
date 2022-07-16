package us.fiestaboleana.programacionuno.exercises;

import us.fiestaboleana.programacionuno.libraries.ScannerLib;
import us.fiestaboleana.programacionuno.objects.Student;

import java.util.ArrayList;
import java.util.List;

public class Matriculero {

    public Matriculero() {
        List<Student> estudiantes = new ArrayList<>();

        boolean keepAddingStudents = true;
        while (keepAddingStudents) {

            String nombre = ScannerLib.scanString("Ingrese nombre del nuevo estudiante");
            double altura = ScannerLib.scanDouble("Ingrese altura del nuevo estudiante (en metros)");
            String cedula = ScannerLib.scanString("Ingrese la cédula del nuevo estudiante");
            String direccion = ScannerLib.scanString("Ingrese la direccion de residencia del nuvo estudiante");
            int edad = ScannerLib.scanInt("Ingrese la edad del nuevo estudiante");
            String id = ScannerLib.scanString("Ingrese el carné del nuevo estudiante");
            int setupCursos = ScannerLib.scanInt("Desea hacer un setup de los cursos? Ingrese '1' de ser así.");

            boolean sc = false;
            if (setupCursos == 1)
                sc = true;

            Student nuevo = new Student(nombre, altura, cedula, direccion, edad, id, sc);
            estudiantes.add(nuevo);

            String input = ScannerLib.scanString("¿Desea ingresar otro estudiante? " +
                    "Ingrese 'no' para finalizar.");
            if (input.equalsIgnoreCase("no")) {
                keepAddingStudents = false;
            }
        }

        estudiantes.forEach(Student::comer);
        System.out.println("");
        estudiantes.forEach(student -> {
            System.out.println("Estudiante: " + student.getNombre());
        });
    }
}
