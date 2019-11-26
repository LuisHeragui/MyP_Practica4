/**
 * Clase para autos que define sus propiedades y muestra sus características.
 */
public class Auto {

    //* La llanta del auto. */
    private Llanta llanta;
    //* El motor del auto. */
    private Motor motor;
    //* La carrocería del auto. */
    private Carroceria carroceria;
    //* El blindaje del auto. */
    private Blindaje blindaje;
    //* El arma del auto. */
    private Arma arma;

    /**
     * Construye un auto a partir de su tipo de llanta, su tipo de motor, su
     * tipo de carrocería, su tipo de blindaje y su tipo de arma.
     * @param llanta el tipo de llanta del auto.
     * @param motor el tipo de motor del auto.
     * @param carroceria el tipo de carrocería del auto.
     * @param blindaje el tipo de blindaje del auto.
     * @param arma el tipo de arma del auto.
     */
    public Auto(Llanta llanta, Motor motor, Carroceria carroceria,
                Blindaje blindaje, Arma arma) {
        this.llanta = llanta;
        this.motor = motor;
        this.carroceria = carroceria;
        this.blindaje = blindaje;
        this.arma = arma;
    }

    /**
     * Regresa el ataque del auto.
     * @return el ataque del auto.
     */
    public int getAtaque() {
        return llanta.getAtaque() + motor.getAtaque() + carroceria.getAtaque() +
               blindaje.getAtaque() + arma.getAtaque();
    }

    /**
     * Regresa la defensa del auto.
     * @return la defensa del auto.
     */
    public int getDefensa() {
        return llanta.getDefensa() + motor.getDefensa() +
               carroceria.getDefensa() + blindaje.getDefensa()
               + arma.getDefensa();
    }

    /**
     * Regresa la velocidad del auto.
     * @return la velocidad del auto.
     */
    public int getVelocidad() {
      return llanta.getVelocidad() + motor.getVelocidad() +
             carroceria.getVelocidad() + blindaje.getVelocidad()
             + arma.getVelocidad();
    }

    /**
     * Regresa el costo del auto.
     * @return el costo del auto.
     */
    public int getCosto() {
      return llanta.getCosto() + motor.getCosto() +
             carroceria.getCosto() + blindaje.getCosto()
             + arma.getCosto();
    }

    /**
     * Muestra los componentes y las características del auto.
     */
    public void muestraAuto() {
        System.out.println("Tu auto es el siguiente:\n" +
                           "Llantas: %s\n" +
                           "Motor: %s\n" +
                           "Carrocería: %s\n" +
                           "Blindaje: %s\n" +
                           "Arma: %s", llanta.getTipo(), motor.getTipo(),
                           carroceria.getTipo(), blindaje.getTipo(),
                           arma.getTipo());
        System.out.println("Tu auto tiene las siguientes características:\n" +
                           "Ataque: %d" +
                           "Defensa: %d" +
                           "Velocidad: %d" +
                           "Costo: $%d", this.getAtaque(), this.getDefensa(),
                           this.getVelocidad(), this.getCosto());

    }
}
