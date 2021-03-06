package ppt.ws;

import exc.NotFoundException;
import java.util.Objects;

/**
 * Clase que representa una partida entre 2 jugadores, identificada por un campo
 * String.
 *
 * @author mor
 * @version 240416
 */
public class Partida {
    
    private String id;
    private Jugador j1;
    private Jugador j2;
    private Jugador ganador;
    
    public Partida() {  }
    
    public Partida(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
    }
    
    /**
     * Actualiza el estado de la partida y retorna quien gana.
     * 
     * @return Positivo si gana J1, negativo si gana J2.
     */
    public int quienGana() {
        int estado = getJ1().getEstado() - getJ2().getEstado();
        if (estado == 0) {
            System.out.println("Empate");
            return victorias();
        }
        if(estado%2 == 0) {
            if (estado < 0)
                getJ1().addVictoria();
            else
                getJ2().addVictoria();
        } else {
            if (estado > 0)
                getJ1().addVictoria();
            else
                getJ2().addVictoria();
        }
        return victorias();
    }

    public int victorias() {
        int victoriasJ1 = getJ1().getVictorias();
        int victoriasJ2 = getJ2().getVictorias();
        if(victoriasJ1==3) setGanador(getJ1());
        if(victoriasJ2==3) setGanador(getJ2());
        return victoriasJ1>victoriasJ2 ? 
                victoriasJ1 :
                victoriasJ2>victoriasJ1 ? 
                    -victoriasJ2 : 0;
    }
    
    public Jugador getJugador(String nombre) throws NotFoundException {
        if (getJ1().getNombre().equals(nombre))
            return j1;
        if(getJ2().getNombre().equals(nombre))
            return j2;
        throw new NotFoundException("El jugador \"" + nombre + "\" no está en esta partida.");
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Jugador getJ1() {
        return j1;
    }

    public void setJ1(Jugador j1) {
        this.j1 = j1;
    }

    public Jugador getJ2() {
        return j2;
    }

    public void setJ2(Jugador j2) {
        this.j2 = j2;
    }

    public Jugador getGanador() {
        return ganador;
    }

    public void setGanador(Jugador ganador) {
        this.ganador = ganador;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Partida other = (Partida) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getId();
    }
    
}
