package ppt;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ppt.ws.Jugador;
import ppt.ws.Partida;
import utils.ServletUtils;

/**
 *
 * @author mor
 * @version 240416
 */
@WebServlet(name = "JocServlet", urlPatterns = {"/Joc"})
public class JocServlet extends HttpServlet {

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
        String gameId = request.getParameter("idPartida");
        String playerName = request.getParameter("nomJugador");
        
        Partida partida = ServletUtils.getPartidaFromId(gameId);
        Jugador j1 = partida.getJ1();
        Jugador j2 = partida.getJ2();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + playerName + " - " + gameId + "</title>");   
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + gameId + "</h1>");
            out.println("<h3>Jugador: </h3><div id=\"jugador\">" + playerName + "</div>");
            out.println("<div id=\"opcions\">");
            out.println("<div>Introdueix la teva opció:</div><br>");
            out.println("<form action=\"/Wait\" method=\"POST\">");
            out.println("<input type=\"radio\" name=\"choice\" value=\"pedra\"/> <label>PEDRA</label><br>");
            out.println("<input type=\"radio\" name=\"choice\" value=\"paper\"/> <label>PAPER</label><br>");
            out.println("<input type=\"radio\" name=\"choice\" value=\"tisores\"/> <label>TISORES</label><br>");
            out.println("<input type=\"hidden\" name=\"idPartida\" value=\"" + gameId + "\"/><br>");
            out.println("<input type=\"hidden\" name=\"nomJugador\" value=\"" + playerName + "\"/><br>");
            out.println("</div>");
            out.println("<div id=\"punts\">");
            out.println("<label>J1: </label><span>" + j1.getNombre() + "</span>");
            out.println("<label>J2: </label><span>" + j2.getNombre() + "</span>");
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String gameId = request.getParameter("idPartida");
        String playerName = request.getParameter("nomJugador");
        
        Partida partida = ServletUtils.getPartidaFromId(gameId);
        Jugador j1 = partida.getJ1();
        Jugador j2 = partida.getJ2();
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>" + playerName + " - " + gameId + "</title>");   
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + gameId + "</h1>");
            out.println("<h3>Jugador: </h3><div id=\"jugador\">" + playerName + "</div>");
            out.println("<div id=\"opcions\">");
            out.println("<div>Introdueix la teva opció:</div><br>");
            out.println("<form action=\"/Wait\" method=\"POST\">");
            out.println("<input type=\"radio\" name=\"choice\" value=\"" + ServletUtils.PIEDRA + "\"/> <label>PEDRA</label><br>");
            out.println("<input type=\"radio\" name=\"choice\" value=\"" + ServletUtils.PAPEL + "\"/> <label>PAPER</label><br>");
            out.println("<input type=\"radio\" name=\"choice\" value=\"" + ServletUtils.TIJERAS + "\"/> <label>TISORES</label><br>");
            out.println("<input type=\"hidden\" name=\"idPartida\" value=\"" + gameId + "\"/><br>");
            out.println("<input type=\"hidden\" name=\"nomJugador\" value=\"" + playerName + "\"/><br>");
            out.println("</div>");
            out.println("<div id=\"punts\">");
            out.println("<label>J1: </label><span>" + j1.getNombre() + "(" + j1.getVictorias() + ")</span>");
            out.println("<label>J2: </label><span>" + j2.getNombre() + "(" + j2.getVictorias() + ")</span>");
            out.println("</div>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
        
        ServletUtils.curPlayer(partida, playerName).setEstado(3000);
    }
    
    private static String getChoice(int ch) {
        switch(ch) {
            case ServletUtils.PIEDRA:
                return "Pedra";
            case ServletUtils.PAPEL:
                return "Paper";
            case ServletUtils.TIJERAS:
                return "Tisores";
            default:
                return "ERROR";
        }
    }

}
