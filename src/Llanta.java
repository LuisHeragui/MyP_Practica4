/**
 * Clase abstracta que define los atributos de una llanta para poder obtenerlos.
 */
public abstract class Llanta {

    /** El ataque de la llanta. */
    protected int ataque;
    /** La defensa de la llanta. */
    protected int defensa;
    /** La velocidad de la llanta. */
    protected int velocidad;
    /** El costo de la llanta. */
    protected int costo;
    /** El tipo de la llanta. */
    protected String tipo;

    /**
     * Regresa el ataque de la llanta.
     * @return el ataque de la llanta.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Regresa la defensa de la llanta.
     * @return la defensa de la llanta.
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Regresa la velocidad de la llanta.
     * @return la velocidad de la llanta.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Regresa el costo de la llanta.
     * @return el costo de la llanta.
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Regresa el tipo de la llanta.
     * @return el tipo de la llanta.
     */
    public String getTipo() {
        return tipo;
    }
}
