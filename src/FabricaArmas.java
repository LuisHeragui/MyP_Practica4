/**
 * Clase que fabrica armas.
 */
public class FabricaArmas implements FabricaComponentes {

    /**
     * Regresa un componente de la fábrica.
     * @param tipoComponente el tipo de componente que queremos de la fábrica.
     * @return un componente de la fábrica.
     */
    public Object getComponente(String tipoComponente) {
        return getArma(tipoComponente);
    }

    /**
     * Regresa una arma de la fábrica.
     * @param tipoArma el tipo de arma que queremos de la fábrica.
     * @return una arma de la fábrica.
     */
    public Arma getArma(String tipoArma) {
        if (tipoArma == null)
            return null;
        else if (tipoArma.equalsIgnoreCase("arpon"))
            return new ArmaArpon();
        else if (tipoArma.equalsIgnoreCase("lanzallamas"))
            return new ArmaLanzallamas();
        else if (tipoArma.equalsIgnoreCase("lanza"))
            return new ArmaLanza();
        else if (tipoArma.equalsIgnoreCase("sierra"))
            return new ArmaSierra();
        else if (tipoArma.equalsIgnoreCase("metralleta"))
            return new ArmaMetralleta();
        return null;
    }
}
