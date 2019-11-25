/**
 * Clase abstracta que define los atributos de un motor para poder obtenerlos.
 */
public abstract class Motor {

    /** El ataque del motor. */
    protected int ataque;
    /** La defensa del motor. */
    protected int defensa;
    /** La velocidad del motor. */
    protected int velocidad;
    /** El costo del motor. */
    protected int costo;
    /** El tipo del motor. */
    protected String tipo;

    /**
     * Regresa el ataque del motor.
     * @return el ataque del motor.
     */
    public int getAtaque() {
    return ataque;
    }

    /**
     * Regresa la defensa del motor.
     * @return la defensa del motor.
     */
    public int getDefensa() {
       return defensa;
    }

    /**
     * Regresa la velocidad del motor.
     * @return la velocidad del motor.
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * Regresa el costo del motor.
     * @return el costo del motor.
     */
    public int getCosto() {
        return costo;
    }

    /**
     * Regresa el tipo del motor.
     * @return el tipo del motor.
     */
    public String getTipo() {
        return tipo;
    }
}
