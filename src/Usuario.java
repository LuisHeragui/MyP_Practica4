/**
 * Clase para los usuarios del programa.
 */
public class Usuario {

    /** El nombre del usuario. */
    private String nombre;
    /** El dinero del usuario. */
    private int dinero;

    /**
     * Construye un usuario a partir de su nombre y establece su dinero.
     * @param nombre el nombre del usuario.
     */
    public Usuario(String nombre) {
        this.nombre = nombre;
        dinero = 350;
    }

    /**
     * Regresa el nombre del usuario.
     * @return el nombre del usuario.
     */
    public String getNombre() {
        return nombre.trim();
    }

    /**
     * Regresa el dinero del usuario.
     * @return el dinero del usuario.
     */
    public int getDinero() {
        return dinero;
    }
}
