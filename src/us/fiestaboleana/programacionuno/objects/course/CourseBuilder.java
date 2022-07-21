package us.fiestaboleana.programacionuno.objects.course;

import us.fiestaboleana.programacionuno.libraries.PanelLib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CourseBuilder {

    public static Course fromPrimitivePanel() {
        String courseName = PanelLib.requestString("Ingrese nombre de curso");
        int grade = PanelLib.requestInteger("Ingrese nota de " + courseName);
        return new Course(grade, courseName);
    }

    public static Course fromDetailedPanel(boolean isWrongGrade, boolean isEmptyGrade) {
        JLabel nameLabel = new JLabel("Nombre del curso");
        JTextField name = new JTextField(20);
        JLabel gradeLabel = new JLabel("Nota");
        if (isWrongGrade) {
            gradeLabel.setForeground(Color.RED);
        }
        String gradeInit = "70";
        JTextField grade = new JTextField(gradeInit, 3);
        grade.setForeground(Color.GRAY);
        if (isEmptyGrade) {
            grade.setForeground(Color.RED);
        }
        grade.setFont(new Font("Monospace", Font.PLAIN, 12));
        grade.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (grade.getText().equals(gradeInit)) {
                    if (!grade.getForeground().equals(Color.BLACK)) {
                        grade.setForeground(Color.BLACK);
                    }
                    grade.selectAll();
                }
            }
        });

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(nameLabel);
        panel.add(name);
        panel.add(gradeLabel);
        panel.add(grade);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "FiestaBooleana - Cursos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            boolean wrongGrade = false;
            boolean emptyGrade = false;

            String courseName = name.getText();
            int courseGrade = 0;
            try {
                courseGrade = Integer.parseInt(grade.getText());
            } catch (NumberFormatException e) {
                wrongGrade = true;
            }
            if (grade.getForeground().equals(Color.GRAY) || grade.getForeground().equals(Color.RED)) {
                emptyGrade = true;
            }
            if (wrongGrade || courseName.isEmpty() || courseGrade == 0) {
                if (wrongGrade) {
                    PanelLib.showMessage("Nota inválida, debe ser un número entero. Ejemplo: 80");
                    return fromDetailedPanel(wrongGrade, emptyGrade);
                }
                return fromDetailedPanel(wrongGrade, emptyGrade);
            }
            return new Course(courseGrade, courseName);
        }
        return null;
    }
}
