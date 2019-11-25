/**
 * Clase que fabrica llantas. 
 */
public class FabricaLlantas implements FabricaComponentes {

    /**
     * Regresa un componente de la fábrica.
     * @param tipoComponente el tipo de componente que queremos de la fábrica.
     * @return un componente de la fábrica.
     */
    public Object getComponente(String tipoComponente) {
        return getLlanta(tipoComponente);
    }

    /**
     * Regresa una llanta de la fábrica.
     * @param tipoLlanta el tipo de llanta que queremos de la fábrica.
     * @return una llanta de la fábrica.
     */
    public Llanta getLlanta(String tipoLlanta) {
        if (tipoLlanta == null)
            return null;
        else if (tipoLlanta.equalsIgnoreCase("simple"))
            return new LlantaSimple();
        else if (tipoLlanta.equalsIgnoreCase("deportiva"))
            return new LlantaDeportiva();
        else if (tipoLlanta.equalsIgnoreCase("offroad"))
            return new LlantaOffRoad();
        else if (tipoLlanta.equalsIgnoreCase("orugadetanque"))
            return new LlantaOrugaDeTanque();
        return null;
    }
}
