package us.fiestaboleana.programacionuno.exercises.herencia;

public abstract class Valentine extends Person {
    String valentine;

    public Valentine(String valentine, String name) {
        super(name);
        this.valentine = valentine;
    }

    public String getValentine() {
        return valentine;
    }

    public void setValentine(String valentine) {
        this.valentine = valentine;
    }
}
