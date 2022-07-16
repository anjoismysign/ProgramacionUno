package us.fiestaboleana.programacionuno.exercises.herencia;

public class Half extends Valentine {
    String half;

    public Half(String valentine, String name, String message) {
        super(valentine, name);
        this.half = "buscando...";
        System.out.println(this.name + ": " + message);
    }

    public String getHalf() {
        return half;
    }

    public void setHalf(String half) {
        this.half = half;
    }
}
