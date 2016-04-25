package ppt.ws;

import java.util.Objects;

/**
 *
 * @author mor
 * @version 240416
 */
class Partida {
    
    private String id;
    private Jugador j1;
    private Jugador j2;
    
    public Partida() {  }
    
    public Partida(Jugador j1, Jugador j2) {
        this.j1 = j1;
        this.j2 = j2;
    }
    
    /**
     * Actualiza el estado de la partida y retorna quien gana.
     * 
     * @param estado Resultado de restar los estados de los jugadores.
     * @return Positivo si gana J1, negativo si gana J2.
     */
    public int quienGana() {
        int estado = getJ1().getEstado() - getJ2().getEstado();
        if (estado == 0) {
            return getJ1().getVictorias() - getJ2().getVictorias();
        }
        if(estado%2 == 0) {
            if (estado > 0)
                getJ1().addVictoria();
            else
                getJ2().addVictoria();
        } else {
            if (estado < 0)
                getJ1().addVictoria();
            else
                getJ2().addVictoria();
        }
        return getJ1().getVictorias() - getJ2().getVictorias();
    }

    public Jugador getJugador(String nombre) {
        if (getJ1().getNombre().equals(nombre))
            return j1;
        if(getJ2().getNombre().equals(nombre))
            return j2;
        return null;
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
    
}
