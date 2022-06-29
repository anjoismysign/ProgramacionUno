/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package us.fiestaboleana.programacionuno.objects;

public class Course {
    private int grade;
    private String courseName;

    public Course(int grade, String clase) {
        this.grade = grade;
        this.courseName = clase;
    }

    public int getGrade() {
        return grade;
    }

    public String getCourseName() {
        return courseName;
    }
}
