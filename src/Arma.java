/**
 * Clase abstracta que define los atributos de una arma para poder obtenerlos.
 */
public abstract class Arma {

    /** El ataque del arma. */
    protected int ataque;
    /** La defensa del arma. */
    protected int defensa;
    /** La velocidad del arma. */
    protected int velocidad;
    /** El costo del arma. */
    protected int costo;
    /** El tipo del arma. */
    protected String tipo;

    /**
     * Regresa el ataque del arma.
     * @return el ataque del arma.
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Regresa la defensa del arma.
     * @return la defensa del arma.
     */
    public int getDefensa() {
        //Código...
    }

    /**
     * Regresa la velocidad del arma.
     * @return la velocidad del arma.
     */
    public int getVelocidad() {
        //Código...
    }

    /**
     * Regresa el costo del arma.
     * @return el costo del arma.
     */
    public int getCosto() {
        //Código...
    }

    /**
     * Regresa el tipo del arma.
     * @return el tipo del arma.
     */
    public String getTipo() {
        //Código...
    }
}
