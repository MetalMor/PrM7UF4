package ppt;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ppt.ws.Partida;
import ppt.ws.PedraPaperTisores;
import ppt.ws.PedraPaperTisores_Service;
import utils.ServletUtils;

/**
 * Servlet per al consumidor del joc PEDRA/PAPER/TISORA
 *
 * @author mor
 * @version 110416
 */
@WebServlet(name = "IniciServlet", urlPatterns = {"/PPT/Inici"})
public class IniciServlet extends HttpServlet {
    
    private static final String DESC = "PEDRA/PAPER/TISORES";

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
        List<Partida> partidas = ServletUtils.getPartidas();
        
        String ruta;
        
        boolean exists = false;
        for (Partida partida: partidas) {
            if (partida.getId().equals(gameId)) exists = !exists;
        }
        
        if (!exists) {
            ServletUtils.iniciarJoc(gameId);
        }
        ruta = exists ? 
                "/JocServlet" : 
                "/WaitServlet";
        ServletUtils.afegirJugador(gameId, playerName);
        
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
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return DESC;
    }

}
