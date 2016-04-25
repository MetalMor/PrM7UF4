package exc;

/**
 * Excepcion que salta cuando no existe la partida solicitada.
 *
 * @author mor
 * @version 240416
 */
public class PartidaNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PartidaNotFoundException</code> without
     * detail message.
     */
    public PartidaNotFoundException() {
    }

    /**
     * Constructs an instance of <code>PartidaNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public PartidaNotFoundException(String msg) {
        super(msg);
    }
}
