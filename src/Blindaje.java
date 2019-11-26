/**
 * Clase abstracta que define los atributos de un blindaje para poder obtenerlos.
 */
public abstract class Blindaje {

    /** El ataque del blindaje. */
    protected int ataque;
    /** La defensa del blindaje. */
    protected int defensa;
    /** La velocidad del blindaje. */
    protected int velocidad;
    /** El costo del blindaje. */
    protected int costo;
    /** El tipo del blindaje. */
    protected String tipo;

    /**
     * Regresa el ataque del blindaje.
     * @return el ataque del blindaje.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Regresa la defensa del blindaje.
     * @return la defensa del blindaje.
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Regresa la velocidad del blindaje.
     * @return la velocidad del blindaje.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Regresa el costo del blindaje.
     * @return el costo del blindaje.
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Regresa el tipo del blindaje.
     * @return el tipo del blindaje.
     */
    public String getTipo() {
        return tipo;
    }
}
