/**
 * Clase que obtiene una fábrica de componentes.
 */
public class ProductorFabricas {

    /**
     * Regresa una fábrica de componentes.
     * @param fabrica la fábrica que necesitamos.
     * @return una fábrica de componentes.
     */
    public static FabricaComponentes getFabrica(String fabrica) {
        if (fabrica.equalsIgnoreCase("llanta"))
            return new FabricaLlantas();
        else if (fabrica.equalsIgnoreCase("carroceria"))
            return new FabricaCarrocerias();
        else if (fabrica.equalsIgnoreCase("motor"))
            return new FabricaMotores();
        else if (fabrica.equalsIgnoreCase("blindaje"))
            return new FabricaBlindajes();
        else if (fabrica.equalsIgnoreCase("arma"))
            return new FabricaArmas();
        return null;
    }
}
