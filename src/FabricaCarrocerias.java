/**
 * Clase que fabrica carrocerias.
 */
public class FabricaCarrocerias implements FabricaComponentes {

    /**
     * Regresa un componente de la fábrica.
     * @param tipoComponente el tipo de componente que queremos de la fábrica.
     * @return un componente de la fábrica.
     */
    public Object getComponente(String tipoComponente) {
        return getCarroceria(tipoComponente);
    }

    /**
     * Regresa una carroceria de la fábrica.
     * @param tipoCarroceria el tipo de carroceria que queremos de la fábrica.
     * @return una carroceria de la fábrica.
     */
    public Carroceria getCarroceria(String tipoCarroceria) {
        if (tipoCarroceria == null)
            return null;
        else if (tipoCarroceria.equalsIgnoreCase("casual"))
            return new CarroceriaCasual();
        else if (tipoCarroceria.equalsIgnoreCase("camion"))
            return new CarroceriaCamion();
        else if (tipoCarroceria.equalsIgnoreCase("deportiva"))
            return new CarroceriaDeportiva();
        return null;
    }
}
