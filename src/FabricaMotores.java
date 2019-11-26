/**
 * Clase que fabrica motores.
 */
public class FabricaMotores implements FabricaComponentes {

    /**
     * Regresa un componente de la fábrica.
     * @param tipoComponente el tipo de componente que queremos de la fábrica.
     * @return un componente de la fábrica.
     */
    public Object getComponente(String tipoComponente) {
        return getMotor(tipoComponente);
    }

    /**
     * Regresa un motor de la fábrica.
     * @param tipoMotor el tipo de motor que queremos de la fábrica.
     * @return un motor de la fábrica.
     */
    public Motor getMotor(String tipoMotor) {
        if (tipoMotor == null)
            return null;
        else if (tipoMotor.equalsIgnoreCase("deportivo"))
            return new MotorDeportivo();
        else if (tipoMotor.equalsIgnoreCase("diesel"))
            return new MotorDiesel();
        else if (tipoMotor.equalsIgnoreCase("simple"))
            return new MotorSimple();
        return null;
    }
}
