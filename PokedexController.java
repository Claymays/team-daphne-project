import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

/** 
 * The PokedexController servlet
 * This servlet will work as the controller for pokedex web app.
 * It does three things:
 *  1. Accepts an HTTP request from the safari jsp
 *  2. Instantiates a Pokemon class and adds the information from the class
 *     to a JavaBean
 *  3. Forward Request object to a pokemon jsp
 *
*/
@WebServlet(
    name = "pokedexController",
    urlPatterns = { "/pokedex-controller" }
)
public class PokedexController extends HttpServlet {
    /** 
     * Handles HTTP GET requests.
     *
     * @param request The HTTP request object
     * @param response The HTTP response object
     * @exception ServletException if there is a Servlet failure
    */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
                // handle request here
            }
}