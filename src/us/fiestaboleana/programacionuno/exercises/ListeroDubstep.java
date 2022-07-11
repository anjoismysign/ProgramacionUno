package us.fiestaboleana.programacionuno.exercises;

import us.fiestaboleana.programacionuno.libraries.ScannerLib;

import java.util.ArrayList;
import java.util.List;

public class ListeroDubstep {

    public ListeroDubstep() {
        List<String> listero = new ArrayList<>();
        boolean continueAdd = true;

        while (continueAdd) {
            String input = ScannerLib.scanString("Ingrese nuevo nombre");
            if (input.equalsIgnoreCase("cancelar")) {
                continueAdd = false;
                break;
            }
            listero.add(input);
        }

        /**
         * forma corta de imprimir dinamicamente una lista
         * "listero" es un objeto de tipo List<String>
         * lo que significa que es un objecto Collection
         * los objectos Collection tienen el metodo "forEach".
         * dicho metodo de forma dinamica permite realizar
         * una accion sobre los elementos de esta coleccion.
         *
         * "System.out::println" utiliza el double colon "::"
         * esto lo que hace es que para System.out va a hacer
         * println(action) siendo "action" el objeto de la
         * coleccion. En este caso listero usa String.
         */
        listero.forEach(System.out::println);
    }
}
