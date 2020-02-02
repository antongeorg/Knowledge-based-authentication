/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import loginwebservices.NextThemtaWs_Service;

/**
 *
 * @author user
 */
public class servlet_next_themata extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/next_themta_ws.wsdl")
    private NextThemtaWs_Service service;

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
            out.println("<title>Servlet servlet_next_themata</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_next_themata at " + request.getContextPath() + "</h1>");
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
		String user1=(String)sess.getAttribute("user1");
                
                HttpSession sess1 = req.getSession(true);
		int par1=(int)sess1.getAttribute("kwd");
                
                int par = 0;
        try {
            par = Integer.parseInt(req.getParameter("par1"));
        } catch (NumberFormatException numberFormatException) {;
        }
         try {
            BufferedWriter logtext = new BufferedWriter(new FileWriter("c:\\telika_apotelesmata\\apotelesmata.txt",true));
            logtext.append(user1 + " " +par + " ");
            logtext.close();
        } catch (IOException iOException) {
        }
           
               updateThematon(par,par1,user1);
                out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> ");  
                out.println("<body background=\"background.jpg\">"); 
                out.println("Η απάντησή σου καταχωρήθηκε");
                out.println("<h1><a href=servlet_start_themata>Next</a></h1>");
               out.println("</body>"); 
                 
                
		
                
                 


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

    private void updateThematon(int arg0, int arg1, java.lang.String arg2) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.NextThemtaWs port = service.getNextThemtaWsPort();
        port.updateThematon(arg0, arg1, arg2);
    }

}
