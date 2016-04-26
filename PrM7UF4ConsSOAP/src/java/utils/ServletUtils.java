package utils;

import java.util.List;
import ppt.ws.Jugador;
import ppt.ws.NotFoundException_Exception;
import ppt.ws.Partida;

/**
 *
 * @author mor
 * @version 240416
 */
public class ServletUtils {
    
    public static final int PIEDRA = -1;
    public static final int PAPEL = 0;
    public static final int TIJERAS = 1;
    
    public static Partida getPartidaFromId(String cp) {
        List<Partida> partidas = getPartidas();
        for(Partida p: partidas) {
            if (p.getId().equals(cp)) return p;
        }
        return null;
    }

    public static Jugador curPlayer(Partida p, String pn) {
        return p.getJ1().getNombre().equals(pn) ?
                p.getJ1():
                p.getJ2();
    }
    
    public static Jugador otherPlayer(Partida p, String pn) {
        return p.getJ1().getNombre().equals(pn) ?
                p.getJ2():
                p.getJ1();
    }

    public static java.util.List<ppt.ws.Partida> getPartidas() {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        return port.getPartidas();
    }

    private static boolean acabarJoc(java.lang.String codiPartida) {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        return port.acabarJoc(codiPartida);
    }

    public static void afegirJugador(java.lang.String codiPartida, java.lang.String jugador) {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        port.afegirJugador(codiPartida, jugador);
    }

    private static int consultarEstatPartida(java.lang.String codiPartida) throws NotFoundException_Exception {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        return port.consultarEstatPartida(codiPartida);
    }

    public static boolean iniciarJoc(java.lang.String codiPartida) {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        return port.iniciarJoc(codiPartida);
    }

    public static void moureJugador(java.lang.String jugador, int tipus) throws NotFoundException_Exception {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        port.moureJugador(jugador, tipus);
    }

    private static void setPartidas(java.util.List<ppt.ws.Partida> arg0) {
        ppt.ws.PedraPaperTisores_Service service = new ppt.ws.PedraPaperTisores_Service();
        ppt.ws.PedraPaperTisores port = service.getPedraPaperTisoresPort();
        port.setPartidas(arg0);
    }
    
}
