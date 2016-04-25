package ppt.ws;

import java.util.Objects;

/**
 * ESTADO:
 * -1: piedra
 * 0: papel
 * 1: tijeras
 *
 * @author mor
 * @version 240416
 */
class Jugador {
    
    private String nombre;
    private int victorias = 0;
    private int estado;
    
    public Jugador() { }
    
    public Jugador(String n) {
        nombre = n;
    }

    public int addVictoria() {
        setVictorias(getVictorias()+1);
        return getVictorias();
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.getNombre(), other.getNombre())) {
            return false;
        }
        return true;
    }
    
    
    
}
