package ppt.ws;

import com.google.gson.Gson;
import exc.NotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
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
    
    private List<Partida> partidas = new ArrayList<>();
    
    public static final int PIEDRA = -1;
    public static final int PAPEL = 0;
    public static final int TIJERAS = 1;
    private Gson gson = new Gson();

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    /**
     * Inicia una partida añadiéndola a la lista de partidas.
     * 
     * @param cp Código String de la partida
     * @return Boolean true si se añadió la partida, false si no.
     */
    @WebMethod(operationName = "iniciarJoc")
    public boolean iniciarJoc(@WebParam(name = "codiPartida") String cp) {
        Partida p = new Partida();
        p.setId(cp);
        //return getPartidas().add(p);
        if(getPartidas().add(p)) {
            System.out.println("Añadida partida " + cp);
            return true;
        }
        return false;
    }
    
    @WebMethod(operationName = "afegirJugador")
    public void afegirJugador(@WebParam(name = "codiPartida") String cp, 
            @WebParam(name = "jugador") String j) {
        Iterator<Partida> it;
        Partida p = null;
        for (it = partidas.iterator(); 
                it.hasNext();) { 
            p = it.next();
            if (p.getId().equals(cp)) {
                if(p.getJ1() == null) {
                    p.setJ1(new Jugador(j));
                    System.out.println(j + " es ahora el jugador 1 de la partida " + p);
                } else if(p.getJ2() == null) {
                    p.setJ2(new Jugador(j));
                    System.out.println(j + " es ahora el jugador 2 de la partida " + p);
                }
            }
        }
    }
    
    @WebMethod(operationName = "moureJugador")
    public void moureJugador(@WebParam(name = "jugador")String jugador, 
            @WebParam(name = "tipus")int tipus) throws NotFoundException {
        Iterator<Partida> it;
        Partida p = null;
        boolean done = false;
        for (it = partidas.iterator(); 
                it.hasNext();) {
            p = it.next();
            try {
                Jugador j = p.getJugador(jugador);
                j.setEstado(tipus);
                done = !done;
                System.out.println(j + " ha cambiado a " + j.getEstado());
                break;
            } catch(NotFoundException nfEx) { 
                System.out.println(jugador + " no está en " + p);
            }
        }
        if(!done) throw new NotFoundException("No se encuentra el jugador \"" + jugador + "\"");
    }
    
    /**
     * Actualiza la partida y retorna quien va ganando.
     * 
     * @param cp Partida a consultar
     * @return Estado de la partida, 404 significa que no ha encontrado la partida.
     * @throws exc.NotFoundException si no encuentra la partida en la lista.
     */
    @WebMethod(operationName = "consultarEstatPartida")
    public String consultarEstatPartida(@WebParam(name = "codiPartida")String cp) throws NotFoundException {
        Iterator<Partida> it;
        Partida partida = null;
        for (it = getPartidas().iterator(); it.hasNext();) {
            partida = it.next();
            if(cp.equals(partida.getId()))  {
                int qg = partida.quienGana();
                System.out.println("Estado de la partida: " + qg + "\n");
                if(qg == 3 || qg == -3)
                    acabarJoc(cp);
                return gson.toJson(qg);
            }
        } 
        throw new NotFoundException("No se encuentra la partida \"" + cp + "\"");
    }
    
    @WebMethod(operationName = "acabarJoc")
    public boolean acabarJoc(@WebParam(name = "codiPartida") String cp) {
        Iterator<Partida> it;
        Partida p = null;
        for (it = getPartidas().iterator(); it.hasNext();) {
            p = it.next();
            if(p.getId().equals(cp)) {
                //return getPartidas().remove(partida);
                if(getPartidas().remove(p)) {
                    System.out.println("Partida terminada " + p + ", ganador: " + p.getGanador());
                    return true;
                }
            }
        }
        return false;
    }
    
}
