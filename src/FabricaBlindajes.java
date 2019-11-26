/**
 * Clase que fabrica blindajes.
 */
public class FabricaBlindajes implements FabricaComponentes {

    /**
     * Regresa un componente de la fábrica.
     * @param tipoComponente el tipo de componente que queremos de la fábrica.
     * @return un componente de la fábrica.
     */
    public Object getComponente(String tipoComponente) {
        return getBlindaje(tipoComponente);
    }

    /**
     * Regresa un blindaje de la fábrica.
     * @param tipoBlindaje el tipo de blindaje que queremos de la fábrica.
     * @return un blindaje de la fábrica.
     */
    public Blindaje getBlindaje(String tipoBlindaje) {
        if (tipoBlindaje == null)
            return null;
        else if (tipoBlindaje.equalsIgnoreCase("simple"))
            return new BlindajeSimple();
        else if (tipoBlindaje.equalsIgnoreCase("reforzado"))
            return new BlindajeReforzado();
        else if (tipoBlindaje.equalsIgnoreCase("tanque"))
            return new BlindajeTanque();
        return null;
    }
}
