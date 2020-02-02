/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import ipopsifiowc.Ipopsifiows_Service;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

public class servlet_ipopsifios extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/ipopsifiows.wsdl")
    private Ipopsifiows_Service service;

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
            out.println("<title>Servlet servlet_ipopsifios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_ipopsifios at " + request.getContextPath() + "</h1>");
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
		      String user = null;
        String pass = null;
        String par1 = null;
        String par2 = null;
        int par3 = 0;
        int par4 = 0;
        try {
            user = req.getParameter("user");
            pass = req.getParameter("pass");
            par1 = req.getParameter("name");
            par2 = req.getParameter("last");
            par3 = Integer.parseInt(req.getParameter("codeke"));
            par4 = Integer.parseInt(req.getParameter("codexe"));
        } catch (NumberFormatException numberFormatException) {
            out.println("<body background=\"back.jpg\">");
            out.println("<font size=\"15\">Κενή φόρμα<font>");
            out.println("</body>");
        }
                
                foo2(user,pass,par1,par2,par3,par4);
                if(showCount()>=1){
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
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private void foo2(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, int arg4, int arg5) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ipopsifiowc.Ipopsifiows port = service.getIpopsifiowsPort();
        port.foo2(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    private int showCount() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ipopsifiowc.Ipopsifiows port = service.getIpopsifiowsPort();
        return port.showCount();
    }

}
