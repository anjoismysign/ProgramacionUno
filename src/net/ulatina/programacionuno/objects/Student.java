/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.ulatina.programacionuno.objects;

import net.ulatina.programacionuno.libraries.ScannerLib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student {

    private final String studentName;
    private HashMap<String, Course> courses;

    public Student(String studentName, boolean setupCourses) {
        this.studentName = studentName;
        this.courses = new HashMap<>();
        if (setupCourses)
            setupCourses();
    }

    public void setupCourses() {
        boolean shouldContinue;
        do {
            String courseName = ScannerLib
                    .scanString("Ingrese nombre de curso");
            int grade = ScannerLib.scanInt("Ingrese nota de " + courseName);
            Course course = new Course(grade, courseName);
            addCourse(course);
            String input = ScannerLib
                    .scanString("¿Desea ingresar otro curso?");
            shouldContinue = input.equalsIgnoreCase("si");
        } while (shouldContinue);
        System.out.printf("");
        System.out.printf("Verificando...");
        getCoursesClone().forEach(course -> {
            System.out.println(course.getCourseName() + ": " + course.getGrade());
        });
        System.out.printf("");
        System.out.printf("¿La informacion es correcta?");
        String input = ScannerLib.scanString("De no ser asi, por favor ingrese 'no'.");
        if (input.equalsIgnoreCase("no")) {
            setupCourses();
            return;
        }
        System.out.printf("");
        System.out.println("Promedio: " + getAverage());
    }

    public String getStudentName() {
        return studentName;
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseName(), course);
    }

    public Course getCourse(String courseName) {
        return courses.get(courseName);
    }

    public List<Course> getCoursesClone() {
        return new ArrayList<>(courses.values());
    }

    public double getAverage() {
        double sum = 0;
        for (Course course : getCoursesClone()) {
            sum += course.getGrade();
        }
        return sum / getCoursesClone().size();
    }
}
