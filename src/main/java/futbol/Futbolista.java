package futbol;

public abstract class Futbolista implements Comparable<Object> {
    //Atributos
    private String nombre;
    private int edad;
    private final String POSICION;

    //Constructores
    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.POSICION = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    //Metodos
    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + POSICION;
    }

    @Override
    public boolean equals(Object f) {
        if (this == f) {
            return true;
        }
        return false;
    }

    public abstract boolean jugarConLasManos();

    public String getNombre() {
        return this.nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public String getPosicion() {
        return this.POSICION;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
}