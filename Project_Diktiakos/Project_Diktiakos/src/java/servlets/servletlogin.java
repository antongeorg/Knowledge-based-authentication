/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import loginwc.Login_Service;
import sun.rmi.server.Dispatcher;

@WebServlet(name = "servletlogin", urlPatterns = {"/servletlogin"})
public class servletlogin extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/login.wsdl")
    private Login_Service service;

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
            out.println("<title>Servlet loginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println();
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

	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
                resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		String user = req.getParameter("username");
		String pass = req.getParameter("password");
                if(login(user,pass)>=1){
                    out.println("    <style>a:link {\n" +
"    text-decoration: none;\n" +
"}</style> ");  
                out.println("<body background=\"back.jpg\">"); 
		out.println("WELCOME");
                
		out.println("<a href=\"adminlogin.html\">Back</a>");
                out.println("</body>"); }
                else{
                    out.println("    <style>a:link {\n" +
"    text-decoration: none;\n" +
"}</style> ");  
                    out.println("<body background=\"back.jpg\">"); 
                    out.println("λάθος κωδικός");
                    out.println("</body>"); 
                }
        
                if(login(user,pass)>=1){
                 out.println(" <!DOCTYPE html>\n" +
"<html >\n" +
"<head>\n" +
"  <meta charset=\"UTF-8\">\n" +
"  <title>Only CSS3 Dropdown Menu</title>\n" +
"  \n" +
"  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css\">\n" +
"\n" +
"  \n" +
"      <link rel=\"stylesheet\" href=\"css/style.css\">\n" +
"\n" +
"  \n" +
"</head>\n" +
"\n" +
"<body>\n" +
"  <div class=\"container\">\n" +
"  <ul>\n" +
"    <li class=\"dropdown\">\n" +
"      <input type=\"checkbox\" />\n" +
"      <a data-toggle=\"dropdown\">Εισαγωγή στοιχείων</a>\n" +
"      <ul class=\"dropdown-menu\">\n" +
"        <li><a href=isagogi_ipopsifiou.html>Εισαγωγή στοιχείων υποψηφίων</a></li>\n" +
"        <li><a href=isagogi_eksetastikoukedrou.html>Εισαγωγή στοιχείων εξεταστικού κέντρου</a></li>\n" +
"        <li><a href=pistopoisi_exetastikou_kentrou.html>Εισαγωγή στοιχείων  διαχειριστή εξεταστικού κέντρου</a></li>\n" +
"        <li> <a href=isagogi_stixio_exetasis.html>Εισαγωγή στοιχείων εξέτασης</a></li>\n" +
"      </ul>\n" +
"    </li>\n" +
"    <li class=\"dropdown\">\n" +
"      <input type=\"checkbox\" />\n" +
"      <a data-toggle=\"dropdown\">Εισαγωγή στοιχείων σε exell</a>\n" +
"      <ul class=\"dropdown-menu\">\n" +
"        <li><a href=themta.html>Εισαγωγή Φύλλου excell Ερωτήσεων</a></li>\n" +
"        <li><a href=up_ipopsifios.html>Εισαγωγή φύλλου excell υποψηφίων</a></li>\n" +
"      </ul>\n" +
"    </li>\n" +
"    <li class=\"dropdown\">\n" +
"      <input type=\"checkbox\" />\n" +
"      <a href=\"#\" data-toggle=\"dropdown\">Αναφορες</a>\n" +
"      <ul class=\"dropdown-menu\">\n" +
"        <li><a href=anafora_exetastiko_kentro.html>Αναφορά ανα εξεταστικό κέντρο</a></li>\n" +
"        <li><a href=anafora_kodikos_thematon.html>Αναφορά ανά κωδικό ερώτησης</a></li>\n" +
"        <li><a href=anafora_kodikos_exetasis.html>Αναφορα ανά κωδικό εξέτασης</a></li>\n" +
"       </ul>\n" +
"    </li>\n" +
"    <li class=\"dropdown\">\n" +
"      <input type=\"checkbox\" />\n" +
"      <a href=\"#\" data-toggle=\"dropdown\">Πιστοποιηση</a>\n" +
"      <ul class=\"dropdown-menu\">\n" +
"        <li><a href=servlet_egkirisi_ipopsifiou>Πιστοποιηση εξεταζομενου</a></li>\n" +
"        <li><a href=servlet_egkrisi_diaxiristi_kentrou>Πιστοποιηση διαχειριστής εξεταστικου κεντρου</a></li>\n" +                         
"      </ul>\n" +
"    </li>\n" +
"  </ul>\n" +
"</div>\n" +
"  \n" +
"  \n" +
"</body>\n" +
"</html>\n" +
"");      
                    
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
    }

// </editor-fold>

    private int login(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwc.Login port = service.getLoginPort();
        return port.login(arg0, arg1);
    }


}