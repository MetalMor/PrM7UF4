package ppt.ws;

import exc.PartidaNotFoundException;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author mor
 * @version 240416
 */
@WebService(serviceName = "PedraPaperTisores")
public class PedraPaperTisores {
    
    private List<Partida> partidas;

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "iniciarJoc")
    public boolean iniciarJoc(@WebParam(name = "codiPartida") String cp) {
        Partida p = new Partida();
        p.setId(cp);
        return partidas.add(p);
    }
    
    @WebMethod(operationName = "moureJugador")
    public void moureJugador(String jugador, int tipus) {
        for (Partida partida: partidas) {
            Jugador j = partida.getJugador(jugador);
            if (j != null) {
                j.setEstado(tipus);
                break;
            }
        }
    }
    
    /**
     * Actualiza la partida y retorna quien va ganando.
     * 
     * @param idPartida Partida a consultar
     * @return Estado de la partida, 404 significa que no ha encontrado la partida.
     */
    @WebMethod(operationName = "consultarEstatPartida")
    public int consultarEstatPartida(String idPartida) throws PartidaNotFoundException {
        for (Partida partida: partidas) {
            if(idPartida.equals(partida.getId())) {
                return partida.quienGana();
            }
        }
        throw new PartidaNotFoundException("No se encuentra la partida \"" + idPartida + "\"");
    }
    
}
