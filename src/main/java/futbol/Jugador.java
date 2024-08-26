package futbol;

public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String POSICION, short golesMarcados, byte dorsal) {
        super(nombre, edad, POSICION);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador() {
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    @Override
    public int compareTo(Object f) {
        if (f instanceof Jugador) {
            Jugador j = (Jugador) f;
            if (this.getEdad() - j.getEdad() >= 0) {
                return this.getEdad() - j.getEdad();
            }
            else {
                return -1*(this.getEdad() - j.getEdad());
            }
        } else {
            return this.getEdad();
        }
    }

    @Override
    public String toString() {
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de " + this.getPosicion() +
                " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }

    public boolean jugarConLasManos() {
        return false;
    }
}