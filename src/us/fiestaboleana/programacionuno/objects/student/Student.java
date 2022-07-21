package us.fiestaboleana.programacionuno.objects.student;

import us.fiestaboleana.programacionuno.libraries.PanelLib;
import us.fiestaboleana.programacionuno.objects.Persona;
import us.fiestaboleana.programacionuno.objects.course.Course;
import us.fiestaboleana.programacionuno.objects.course.CourseBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Student extends Persona {

    /**
     * Esto es el famoso "carné" de un estudiante.
     */
    private String id;
    private HashMap<String, Course> courses;

    public Student(String nombre, double altura, String cedula,
                   String direccion, int edad, String id, boolean setupCursos) {
        super(nombre, altura, cedula, direccion, edad);
        this.id = id;
        this.courses = new HashMap<>();
        if (setupCursos) {
            setupCourses();
        }
    }

    public final void setupCourses() {
        boolean shouldContinue;
        do {
            Course course = CourseBuilder.fromDetailedPanel(false, false);
            addCourse(course);
            String input = PanelLib
                    .requestString("¿Desea ingresar otro curso?");
            shouldContinue = input.equalsIgnoreCase("si");
        } while (shouldContinue);
        System.out.println("");
        System.out.println("Verificando...");
        getCoursesClone().forEach(course -> {
            System.out.println(course.getCourseName() + ": " + course.getGrade());
        });
        System.out.println("");
        PanelLib.showMessage("Promedio: " + getAverage());
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


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}