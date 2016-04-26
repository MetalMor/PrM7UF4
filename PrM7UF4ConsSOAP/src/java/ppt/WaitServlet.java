package ppt;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ppt.ws.Jugador;
import ppt.ws.NotFoundException_Exception;
import ppt.ws.Partida;
import utils.ServletUtils;

/**
 *
 * @author mor
 * @version 260416
 */
@WebServlet(name = "WaitServlet", urlPatterns = {"/Wait"})
public class WaitServlet extends HttpServlet {

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String playerName = request.getParameter("nomJugador");
        String gameId = request.getParameter("idPartida");
        String ruta = "/Joc";
        List<Partida> partidas = ServletUtils.getPartidas();
        Partida partida = ServletUtils.getPartidaFromId(gameId);
        
        while (partida.getJ2() == null);
        
        request.setAttribute("nomJugador", playerName);
        request.setAttribute("idPartida", gameId);
        RequestDispatcher rd = request.getRequestDispatcher(ruta);
	rd.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String playerName = request.getParameter("nomJugador");
        String gameId = request.getParameter("idPartida");
        int choice = Integer.parseInt(request.getParameter("choice"));
        String ruta = "/JocServlet";
        List<Partida> partidas = ServletUtils.getPartidas();
        Partida partida = ServletUtils.getPartidaFromId(gameId);
        
        Jugador curPLayer = ServletUtils.curPlayer(partida, playerName);
        Jugador otherPlayer = ServletUtils.otherPlayer(partida, playerName);
        try {
            ServletUtils.moureJugador(playerName, choice);
        } catch (NotFoundException_Exception ex) {
            ex.printStackTrace();
        }
        while (otherPlayer.getEstado() == 3000);
        
        request.setAttribute("nomJugador", playerName);
        request.setAttribute("idPartida", gameId);
        RequestDispatcher rd = request.getRequestDispatcher(ruta);
	rd.forward(request, response);
    }
    
}
