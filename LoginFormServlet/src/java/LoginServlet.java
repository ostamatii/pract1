/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Katja
 */
@WebServlet(urlPatterns = {"/LoginServlet"}, initParams = {
    @WebInitParam(name = "login", value = "Ostamatii"),
    @WebInitParam(name = "password", value = "Ostamatii")})
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String loginParam = request.getParameter("login");
        String passwordParam = request.getParameter("password");
        
        ServletConfig context = getServletConfig();
        String login = context.getInitParameter("login");
        String password = context.getInitParameter("password");
        
        if (loginParam.equals(login)& passwordParam.equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("login", login);
            session.setAttribute("login", login);
           // session.s
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h3 style='color:grey'> Hello, you are loged in </h3><br><br>");
            out.println("<p>  - Вовочка, а ти школярик?<br>" +
                             "- Я не школярик, я садист. Я в садочок ходжу.</p>");
            out.println("<p style='text-align:center'> *** </p>");
            out.println("<p>  Мама запитує у Вовочки:<br>" +
                              "- Як справи в школі?<br>" +
                              "- Вчителька сказала, що я зовсім не знаю математики," +
                              "І поставила мені в щоденник якусь цифру.</p>");
            
            out.println("</body>");
            out.println("</html>");
        }
        }
        else response.sendRedirect(response.encodeRedirectURL(request.getContextPath() + "/errorLogin.jsp"));
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
       // processRequest(request, response);
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
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
