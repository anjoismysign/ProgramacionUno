/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package us.fiestaboleana.programacionuno.objects.course;

public class Course {
    private int grade;
    private String courseName;
    private CourseStatus courseStatus;

    public Course(int grade, String courseName) {
        this.grade = grade;
        this.courseName = courseName;
        setCourseStatus();
    }

    public int getGrade() {
        return grade;
    }

    public String getCourseName() {
        return courseName;
    }

    public CourseStatus getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus() {
        if (grade >= 70) {
            courseStatus = CourseStatus.APROBADO;
            return;
        }
        if (grade >= 60) {
            courseStatus = CourseStatus.AMPLIACION;
            return;
        }
        courseStatus = CourseStatus.REPROBADO;
    }
}
