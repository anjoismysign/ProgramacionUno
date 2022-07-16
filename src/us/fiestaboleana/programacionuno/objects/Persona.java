package us.fiestaboleana.programacionuno.objects;

public class Persona {

    private String nombre;
    private double altura;
    private String cedula;
    private String direccion;
    private int edad;

    public Persona(String nombre, double altura, String cedula,
                   String direccion, int edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.cedula = cedula;
        this.direccion = direccion;
        this.edad = edad;
    }

    /**
     * En caso de necesitar un carlitos generico,
     * acudir a este metodo estatico.
     */
    public static Persona carlitos() {
        return new Persona("Carlos", 1.52, "000000000",
                "San Juan de Pereira, 28212", 21);
    }

    /**
     * En csaso de necesitar un carlitos generico,
     * pero con nombre y cedula distintos,
     * acudir a este metodo estatico.
     */
    public static Persona rebrandCarlitos(String nombre, String cedula) {
        return new Persona(nombre, 1.52, cedula,
                "San Juan de Pereira, 28212", 21);
    }

    /**
     * En caso de necesitar un carlitos generico,
     * pero con solo el nombre distinto,
     * acudir a este metodo estatico.
     */
    public static Persona simpleRebrandCarlitos(String nombre) {
        return new Persona(nombre, 1.52, "000000000",
                "San Juan de Pereira, 28212", 21);
    }

    public String getNombre() {
        return nombre;
    }

    public double getAltura() {
        return altura;
    }

    public String cedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void comer() {
        System.out.println(nombre + " está monchando");
    }

    public void trabajar() {
        System.out.println(nombre + " está breteando");
    }

    public void respirar() {
        System.out.println(nombre + " está respirando");
    }

    public void beber() {
        System.out.println(nombre + " está bebiendo");
    }
}
