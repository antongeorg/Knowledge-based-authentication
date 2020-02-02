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
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import loginwebservices.EgkrisiIpopsifiouWc_Service;

/**
 *
 * @author user
 */
public class servlet_egkirisi_ipopsifiou extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/egkrisi_ipopsifiou_wc.wsdl")
    private EgkrisiIpopsifiouWc_Service service;

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
            out.println("<title>Servlet servlet_egkirisi_ipopsifiou</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_egkirisi_ipopsifiou at " + request.getContextPath() + "</h1>");
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
		HttpSession sess = req.getSession(true);
		String user=(String)sess.getAttribute("user1");
                String pass=(String)sess.getAttribute("pass1");

                if(egkrisiIpopsifiou(user,pass)>= 1){
                    out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> ");  
                    out.println("<body background=\"back.jpg\">"); 
                    out.println("Έδωσες έγκριση στο χρήστη!");
                    out.println("</body>"); 
                }
                else
                {
                    out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> ");  
                    out.println("<body background=\"back.jpg\">"); 
                    out.println("Δεν έδωσες έγκριση στο χρήστη");
                    out.println("</body>");
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

    private int egkrisiIpopsifiou(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.EgkrisiIpopsifiouWc port = service.getEgkrisiIpopsifiouWcPort();
        return port.egkrisiIpopsifiou(arg0, arg1);
    }

}
