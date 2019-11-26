/**
 * Clase para autos que define sus propiedades y muestra sus características.
 */
public class Auto {

    //* Las llantas del auto. */
    private Llanta llantas;
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
     * @param llantas el tipo de llanta del auto.
     * @param motor el tipo de motor del auto.
     * @param carroceria el tipo de carrocería del auto.
     * @param blindaje el tipo de blindaje del auto.
     * @param arma el tipo de arma del auto.
     */
    public Auto(Llanta llantas, Motor motor, Carroceria carroceria,
                Blindaje blindaje, Arma arma) {
        this.llantas = llantas;
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
        return llantas.getAtaque() + motor.getAtaque() + carroceria.getAtaque()
               + blindaje.getAtaque() + arma.getAtaque();
    }

    /**
     * Regresa la defensa del auto.
     * @return la defensa del auto.
     */
    public int getDefensa() {
        return llantas.getDefensa() + motor.getDefensa() +
               carroceria.getDefensa() + blindaje.getDefensa() +
               arma.getDefensa();
    }

    /**
     * Regresa la velocidad del auto.
     * @return la velocidad del auto.
     */
    public int getVelocidad() {
      return llantas.getVelocidad() + motor.getVelocidad() +
             carroceria.getVelocidad() + blindaje.getVelocidad() +
             arma.getVelocidad();
    }

    /**
     * Regresa el costo del auto.
     * @return el costo del auto.
     */
    public int getCosto() {
      return llantas.getCosto() + motor.getCosto() + carroceria.getCosto() +
             blindaje.getCosto() + arma.getCosto();
    }

    /**
     * Muestra los componentes y las características del auto.
     */
    public void muestraAuto() {
        String s = String.format("El auto construido es el siguiente:\n" +
                                 "  Llantas: %s\n" +
                                 "  Motor: %s\n" +
                                 "  Carrocería: %s\n" +
                                 "  Blindaje: %s\n" +
                                 "  Arma: %s", llantas.getTipo(),
                                 motor.getTipo(), carroceria.getTipo(),
                                 blindaje.getTipo(), arma.getTipo());
        System.out.println(s);
        s = String.format("El auto tiene las siguientes características:\n" +
                          "  Ataque: %d" +
                          "  Defensa: %d" +
                          "  Velocidad: %d\n" +
                          "Costo: $%d", this.getAtaque(), this.getDefensa(),
                          this.getVelocidad(), this.getCosto());
        System.out.println(s);

    }
}
