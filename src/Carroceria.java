/**
 * Clase abstracta que define los atributos de una carroceria para poder
 * obtenerlos.
 */
public abstract class Carroceria {

    /** El ataque de la carroceria. */
    protected int ataque;
    /** La defensa de la carroceria. */
    protected int defensa;
    /** La velocidad de la carroceria. */
    protected int velocidad;
    /** El costo de la carroceria. */
    protected int costo;
    /** El tipo de la carroceria. */
    protected String tipo;

    /**
     * Regresa el ataque de la carroceria.
     * @return el ataque de la carroceria.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Regresa la defensa de la carroceria.
     * @return la defensa de la carroceria.
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Regresa la velocidad de la carroceria.
     * @return la velocidad de la carroceria.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Regresa el costo de la carroceria.
     * @return el costo de la carroceria.
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Regresa el tipo de la carroceria.
     * @return el tipo de la carroceria.
     */
    public String getTipo() {
        return tipo;
    }
}
