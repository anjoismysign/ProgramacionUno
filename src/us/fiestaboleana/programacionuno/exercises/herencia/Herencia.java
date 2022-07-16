package us.fiestaboleana.programacionuno.exercises.herencia;

public class Herencia {

    public Herencia() {
        Half[] halves = {new Half("Dulcinea", "Quijote", "¿Serías mi San Valentín?"),
                new Half("Dulcinea", "Dulcinea", "Sí, lo sería.")};
        /**
         *  “Según la mitología griega, los humanos fueron creados originalmente con cuatro brazos,
         *  cuatro piernas y una cabeza con dos caras. Temiendo su poder, Zeus los dividió en dos
         *  partes separadas, condenándolos a pasar sus vidas en busca de sus otras mitades”.
         *
         *  Yo opino que una de cada diez mitades encuentra a la suya.
         */
        int x = 1 + (int) (Math.random() * 10);
        if (x == 9) {
            for (Half half : halves) {
                half.setHalf(half.getValentine());
            }
        }
        for (Half half : halves) {
            System.out.println("-❤-❤-❤-❤-❤-❤-❤-❤-❤-❤-❤-❤-❤-");
            System.out.println("Nombre: " + half.getName());
            System.out.println("San Valentin: " + half.getValentine());
            System.out.println("Mitad: " + half.getHalf());
        }
    }
}
