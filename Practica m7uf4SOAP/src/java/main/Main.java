package main;

import exc.NotFoundException;
import ppt.ws.PedraPaperTisores;

/**
 *
 * @author mor
 * @version 250416
 */
public class Main {
    
    public static void main(String[] args) {
        String cp = "prueba";
        String j1 = "Pepito";
        String j2 = "Juanito";
        int[] pos = new int[3];
        pos[0] = PedraPaperTisores.PIEDRA;
        pos[1] = PedraPaperTisores.PAPEL;
        pos[2] = PedraPaperTisores.TIJERAS;
        
        PedraPaperTisores ppt = new PedraPaperTisores();
        
        ppt.iniciarJoc(cp);
        ppt.afegirJugador(cp, j1);
        ppt.afegirJugador(cp, j2);
        
        try {
            int max = pos.length-1;
            while(ppt.getPartidas().size() > 0) {
                ppt.moureJugador(j1, pos[randomNumber(max)]);
                ppt.moureJugador(j2, pos[randomNumber(max)]);
                ppt.consultarEstatPartida(cp);
            }
        } catch(NotFoundException nfEx) {
            nfEx.printStackTrace();
        }
        
    }
    
    public static int randomNumber(int max) {
        return (int) (Math.random()*max+1);
    }
    
}
