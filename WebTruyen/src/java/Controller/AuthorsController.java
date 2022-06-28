/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Entity.DAOAuthors;
import Model.Authors;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dinht
 */
@WebServlet(name = "AuthorsController", urlPatterns = {"/AuthorsController"})
public class AuthorsController extends HttpServlet {
    private final String Insert_Or_Edit = "/Authors.jsp";
    private final String List_Author = "/ListAuthor.jsp";
    private final DAOAuthors DaoAuthor;

    public AuthorsController()  throws SQLException,Exception{
        super();
        DaoAuthor = new DAOAuthors();
    }
    

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet AuthorsController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AuthorsController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
       String forward="";
       String action = request.getParameter("Action");
       if (action.equalsIgnoreCase("ListAuthor")){
           try{
               forward = List_Author;
               List<Authors> author = DaoAuthor.GetAllAuthors();
               request.setAttribute("Author", author);
               
           } catch (Exception ex) {
               Logger.getLogger(AuthorsController.class.getName()).log(Level.SEVERE, null, ex);
           }
       } else if(action.equalsIgnoreCase("Edit")) {
           try{
               forward = Insert_Or_Edit;
              int id = Integer.parseInt(request.getParameter("id"));
              Authors author = DaoAuthor.GetAuthorById(id);
               request.setAttribute("Author", author);
               
           } catch (Exception ex) {
               Logger.getLogger(AuthorsController.class.getName()).log(Level.SEVERE, null, ex);
           }
       } else if (action.equalsIgnoreCase("Delete"))
       {
           try{
               int id = Integer.parseInt(request.getParameter("id"));
               DaoAuthor.DeleteAuthor(id);
               forward = List_Author;
              List<Authors> author = DaoAuthor.GetAllAuthors();
               request.setAttribute("Author", author);
               
           } catch (Exception ex) {
               Logger.getLogger(AuthorsController.class.getName()).log(Level.SEVERE, null, ex);
           }
    } else {
           forward = Insert_Or_Edit;
       }
       RequestDispatcher view = request.getRequestDispatcher(forward);
       view.forward(request, response);
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
       Authors author = new Authors();
       author.setName(request.getParameter("Name"));
       author.setAlias(request.getParameter("Alias"));
       author.setKeyword(request.getParameter("Keyword"));
       author.setDescription(request.getParameter("Description"));
       //Date date=java.util.Calendar.getInstance().getTime();
       String id = request.getParameter("id");
       if (id == null|| id.isEmpty()){
           try{
               DaoAuthor.InsertAuthor(author);
               
           } catch (Exception ex) {
               Logger.getLogger(AuthorsController.class.getName()).log(Level.SEVERE, null, ex);
           }
       } else {
           try{
               author.setId(Integer.parseInt(id));
               DaoAuthor.UpdateAuthor(author);
               
           } catch (Exception ex) {
               Logger.getLogger(AuthorsController.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       try{
              List<Authors> authors = DaoAuthor.GetAllAuthors();
              request.setAttribute("Author", authors);
               
           } catch (Exception ex) {
               Logger.getLogger(AuthorsController.class.getName()).log(Level.SEVERE, null, ex);
           }
       RequestDispatcher view = request.getRequestDispatcher(List_Author);
       view.forward(request, response);
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
