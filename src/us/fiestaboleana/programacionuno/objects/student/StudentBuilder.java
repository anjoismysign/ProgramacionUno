package us.fiestaboleana.programacionuno.objects.student;

import us.fiestaboleana.programacionuno.libraries.PanelLib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class StudentBuilder {

    public static Student fromPrimitivePanel() {
        String nombre = PanelLib.requestString("Ingrese nombre del estudiante");
        double altura = PanelLib.requestDouble("Ingrese altura del estudiante (en metros)");
        String cedula = PanelLib.requestString("Ingrese cedula del estudiante");
        String direccion = PanelLib.requestString("Ingrese direccion del estudiante");
        int edad = PanelLib.requestInteger("Ingrese edad del estudiante");
        String id = PanelLib.requestString("Ingrese carne del estudiante");
        boolean setupCursos = PanelLib.requestString("¿Desea ingresar cursos?").equalsIgnoreCase("si");
        return new Student(nombre, altura, cedula, direccion, edad, id, setupCursos);
    }

    public static Student fromDetailedPanel() {
        return fromDetailedPanel(false, false, false, false);
    }

    public static Student fromDetailedPanel(boolean isWrongHeight, boolean isWrongAge,
                                            boolean isEmptyHeight, boolean isEmptyAge) {
        JLabel nombreLabel = new JLabel("Nombre completo");
        JTextField nombre = new JTextField(20);
        JLabel alturaLabel = new JLabel("Altura (en metros)");
        if (isWrongHeight) {
            alturaLabel.setForeground(Color.RED);
        }
        String alturaInit = "1.51";
        JTextField altura = new JTextField(alturaInit, 3);
        altura.setForeground(Color.GRAY);
        if (isEmptyHeight) {
            altura.setForeground(Color.RED);
        }
        altura.setFont(new Font("Monospace", Font.PLAIN, 12));
        altura.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (altura.getText().equals(alturaInit)) {
                    if (!altura.getForeground().equals(Color.BLACK)) {
                        altura.setForeground(Color.BLACK);
                    }
                    altura.selectAll();
                }
            }
        });
        JLabel cedulaLabel = new JLabel("Cédula de identidad");
        JTextField cedula = new JTextField(9);
        JLabel direccionLabel = new JLabel("Dirección");
        JTextField direccion = new JTextField(20);
        JLabel edadLabel = new JLabel("Edad");
        if (isWrongAge) {
            edadLabel.setForeground(Color.RED);
        }
        String edadInit = "17";
        JTextField edad = new JTextField(edadInit, 3);
        edad.setForeground(Color.GRAY);
        if (isEmptyAge) {
            edad.setForeground(Color.RED);
        }
        edad.setFont(new Font("Monospace", Font.PLAIN, 12));
        edad.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e) {
                if (edad.getText().equals(edadInit)) {
                    if (!edad.getForeground().equals(Color.BLACK)) {
                        edad.setForeground(Color.BLACK);
                    }
                    edad.selectAll();
                }
            }
        });
        JLabel idLabel = new JLabel("Carné de estudiante");
        JTextField id = new JTextField(11);

        JPanel panel = new JPanel(new GridLayout(6, 2));
        panel.add(nombreLabel);
        panel.add(nombre);
        panel.add(alturaLabel);
        panel.add(altura);
        panel.add(cedulaLabel);
        panel.add(cedula);
        panel.add(direccionLabel);
        panel.add(direccion);
        panel.add(edadLabel);
        panel.add(edad);
        panel.add(idLabel);
        panel.add(id);

        int result = JOptionPane.showConfirmDialog(null, panel,
                "FiestaBooleana - Estudiante", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            boolean wrongHeight = false;
            boolean wrongAge = false;
            boolean emptyHeight = false;
            boolean emptyAge = false;

            String name = nombre.getText();
            double height = 0;
            try {
                height = Double.parseDouble(altura.getText());
            } catch (NumberFormatException e) {
                wrongHeight = true;
            }
            if (altura.getForeground().equals(Color.GRAY) || altura.getForeground().equals(Color.RED)) {
                emptyHeight = true;
            }
            String governmentId = cedula.getText();
            String address = direccion.getText();
            int age = 0;
            try {
                age = Integer.parseInt(edad.getText());
            } catch (NumberFormatException e) {
                wrongAge = true;
            }
            if (edad.getForeground().equals(Color.GRAY) || edad.getForeground().equals(Color.RED)) {
                emptyAge = true;
            }
            String studentId = id.getText();
            if (wrongHeight || wrongAge || name.isEmpty() || governmentId.isEmpty() ||
                    address.isEmpty() || age == 0 || studentId.isEmpty() || emptyHeight || emptyAge) {
                if (wrongHeight && wrongAge) {
                    PanelLib.showMessage("Altura inválida, debe ser un número entero o decimal. " +
                            "Ejemplo: 1.75" +
                            "\nEdad inválida, debe ser un número entero. Ejemplo: 21");
                    return fromDetailedPanel(wrongHeight, wrongAge, emptyHeight, emptyAge);
                }
                if (wrongHeight) {
                    PanelLib.showMessage("Altura inválida, " +
                            "debe ser un número entero o decimal. Ejemplo: 1.75");
                    return fromDetailedPanel(wrongHeight, wrongAge, emptyHeight, emptyAge);
                }
                if (wrongAge) {
                    PanelLib.showMessage("Edad inválida, debe ser un número entero. Ejemplo: 21");
                    return fromDetailedPanel(wrongHeight, wrongAge, emptyHeight, emptyAge);
                }
                return fromDetailedPanel(wrongHeight, wrongAge, emptyHeight, emptyAge);
            }
            return new Student(name, height, governmentId, address, age, studentId, true);
        }
        return null;
    }
}
