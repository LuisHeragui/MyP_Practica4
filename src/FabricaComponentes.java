/**
 * Interfaz que define el comportamiento que tendrá la fábrica de cierto
 * componente.
 */
public interface FabricaComponentes {

    /**
     * Regresa un componente de la fábrica.
     * @param tipoComponente el tipo de componente que queremos de la fábrica.
     * @return un componente de la fábrica.
     */
    public Object getComponente(String tipoComponente);

}
