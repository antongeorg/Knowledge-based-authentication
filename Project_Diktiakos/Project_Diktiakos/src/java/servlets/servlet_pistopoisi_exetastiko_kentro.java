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
import loginwebservices.PistopoisiExestikouKentrouWs_Service;


public class servlet_pistopoisi_exetastiko_kentro extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/pistopoisi_exestikou_kentrou_ws.wsdl")
    private PistopoisiExestikouKentrouWs_Service service;

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
            out.println("<title>Servlet servlet_pistopoisi_exetastiko_kentro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_pistopoisi_exetastiko_kentro at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   
    @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
                resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
        String par1 = null;
        String par2 = null;
        String par3 = null;
        String par4 = null;
        try {
            par1 = req.getParameter("name");
            par2 = req.getParameter("last");
            par3 = req.getParameter("username");
            par4=  req.getParameter("pass");
        } catch (NumberFormatException numberFormatException) {
            out.println("<body background=\"back.jpg\">");
            out.println("<font size=\"15\">Κενή φόρμα<font>");
            out.println("</body>");
        }
                
                pistopoisiExetastikouKentrou(par1,par2,par3,par4);
                if(showCount2()>=1){
                    out.println("<body background=\"back.jpg\">");
                    out.println("<font size=\"15\">Πετυχε καταχωρηση<font>");
                     out.println("</body>");
                }else{
                    out.println("<body background=\"back.jpg\">");
                    out.println("<font size=\"15\">Απετυχε καταχωρηση<font>");
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

    private void pistopoisiExetastikouKentrou(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.PistopoisiExestikouKentrouWs port = service.getPistopoisiExestikouKentrouWsPort();
        port.pistopoisiExetastikouKentrou(arg0, arg1, arg2, arg3);
    }

    private int showCount2() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.PistopoisiExestikouKentrouWs port = service.getPistopoisiExestikouKentrouWsPort();
        return port.showCount2();
    }
    

}
