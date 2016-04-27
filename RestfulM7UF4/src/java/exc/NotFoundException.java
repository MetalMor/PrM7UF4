package exc;

/**
 * Excepcion que salta cuando no existe la partida solicitada.
 *
 * @author mor
 * @version 240416
 */
public class NotFoundException extends Exception {

    /**
     * Creates a new instance of <code>PartidaNotFoundException</code> without
     * detail message.
     */
    public NotFoundException() {
    }

    /**
     * Constructs an instance of <code>PartidaNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotFoundException(String msg) {
        super(msg);
    }
}
