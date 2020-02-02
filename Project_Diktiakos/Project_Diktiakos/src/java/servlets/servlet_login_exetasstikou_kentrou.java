/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import loginwebservices.LoginExetastikouKetrouWs_Service;

/**
 *
 * @author user
 */
public class servlet_login_exetasstikou_kentrou extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/login_exetastikou_ketrou_ws.wsdl")
    private LoginExetastikouKetrouWs_Service service;

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet_login_exetasstikou_kentrou</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_login_exetasstikou_kentrou at " + request.getContextPath() + "</h1>");
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
                resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
                if(loginExetastikouKentrou(user,pass)>=1){
                 out.println("<a href=servlet_exetastikou_kentrou_teliko>Next Step</a>");
                }
		 
                else{out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> "
                        + "<body background=\"back.jpg\">"
                        + "<center><font color=\"\">Λάθος username ή password Διαχειριστή</font></center>"
                        + "</body>"
                );  
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

    private int loginExetastikouKentrou(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.LoginExetastikouKetrouWs port = service.getLoginExetastikouKetrouWsPort();
        return port.loginExetastikouKentrou(arg0, arg1);
    }

    private int returnApp() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.LoginExetastikouKetrouWs port = service.getLoginExetastikouKetrouWsPort();
        return port.returnApp();
    }

    
}
