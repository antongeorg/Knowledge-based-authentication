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
import loginwebservices.FinalApotelesmataWs_Service;
import loginwebservices.PistopoisiXristiWs_Service;
import loginwebservices.StartThemata_Service;
import loginwebservices.TelikiEpistrofi_Service;


public class servlet_start_themata extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/start_themata.wsdl")
    private StartThemata_Service service_3;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/final_apotelesmata_ws.wsdl")
    private FinalApotelesmataWs_Service service_2;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/pistopoisi_xristi_ws.wsdl")
    private PistopoisiXristiWs_Service service_1;

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/teliki_epistrofi.wsdl")
    private TelikiEpistrofi_Service service;

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
            out.println("<title>Servlet servlet_start_themata</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_start_themata at " + request.getContextPath() + "</h1>");
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
		String par1 = null;
                HttpSession sess = req.getSession(true);
		String user1=(String)sess.getAttribute("user1");
                String pass1=(String)sess.getAttribute("pass1");

                  returnApotelesmata(user1,pass1);
                  if( pistopoisiXristi(user1,pass1)==1){
                  if(showTelikaApotelesmata()<5){ 
                  themataRandom(user1);
                  out.println("<font size=\"6\">");
                  out.println(getErwtisi());
                  out.println(getChoice1());
                  out.println(getChoice2());
                  out.println(getChoice3());
                  out.println(getChoice4());
                   out.println("</font>");
                  HttpSession sess1 = req.getSession(); 
               sess1.setAttribute("kwd", getNumberCode());
                    out.println("<body background=\"background.jpg\">"); 
                    out.println("<html>\n" +"<body>\n" +"\n" +"\n" +"<form action=\"servlet_next_themata\" method=\"get\">\n" +
"<select name=\"par1\">\n" +
"  <option value=\"1\">1</option>\n" +
"  <option value=\"2\">2</option>\n" +
"  <option value=\"3\">3</option>\n" +
"  <option value=\"4\">4</option>\n" +
"</select>\n" +
"<input type=\"submit\" value=\"Submit\">\n" +
"</form>\n" +
"  \n" +
"</body>\n" +
"</html>");
                  out.println("<html><head>\n" +
"\n" +
"</head>\n" +
"<body>\n" +
"    <div id=\"divCounter\"></div>\n" +
"    <script type=\"text/javascript\">\n" +
"    if(localStorage.getItem(\"counter\")){\n" +
"      if(localStorage.getItem(\"counter\") >= 300){\n" +
"        var value = 0;\n" +
"      }else{\n" +
"        var value = localStorage.getItem(\"counter\");\n" +
"      }\n" +
"    }else{\n" +
"      var value = 0;\n" +
"\n" +
"    }\n" +
"    document.getElementById('divCounter').innerHTML = value;\n" +
"\n" +
"    var counter = function (){\n" +
"      if(value >= 300){\n" +
"	      window.location.href = \"timeout.html\";\n" +
"\n" +
"        localStorage.setItem(\"counter\", 0);\n" +
"        value = 0;\n" +
"      }else{\n" +
"        value = parseInt(value)+1;\n" +
"        localStorage.setItem(\"counter\", value);\n" +
"      }\n" +
"      document.getElementById('divCounter').innerHTML = value;\n" +
"    };\n" +
"\n" +
"    var interval = setInterval(function (){counter();}, 1000);\n" +
"  </script>\n" +
"</body></html>");
 out.println("</body>");                 }
                  
                  else
                  {
                      out.println("    <style>a:link {\n" +
"    text-decoration: none;\n" +
"}</style> ");  
                      out.println("<body background=\"background.jpg\">");
                      out.println("<font size=\"6\">");
                      out.println("Ολοκλήρωσες το Τεστ!");
                      out.println(finalResult(user1,pass1));
                      out.println("<font>");
                      out.println("</body>"); 
                  }
                  
        
                }
                    else
               {
                   out.println("    <style>a:link {\n" +
"    text-decoration: none;\n" +
"}</style> ");  
                   out.println("<body background=\"background.jpg\">"); 
                   out.println("Δεν πήρες έγκριση");
                out.println("</body>"); 
              
                   }
                out.println("<a href=servlet_start_themata>Try Again</a>");
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

    private String finalResult(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.TelikiEpistrofi port = service.getTelikiEpistrofiPort();
        return port.finalResult(arg0, arg1);
    }

    private int pistopoisiXristi(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.PistopoisiXristiWs port = service_1.getPistopoisiXristiWsPort();
        return port.pistopoisiXristi(arg0, arg1);
    }

    private void returnApotelesmata(java.lang.String arg0, java.lang.String arg1) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.FinalApotelesmataWs port = service_2.getFinalApotelesmataWsPort();
        port.returnApotelesmata(arg0, arg1);
    }

    private int showTelikaApotelesmata() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.FinalApotelesmataWs port = service_2.getFinalApotelesmataWsPort();
        return port.showTelikaApotelesmata();
    }

    private void arxikopoisiThemata() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        port.arxikopoisiThemata();
    }

    private String getChoice1() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.getChoice1();
    }

    private String getChoice2() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.getChoice2();
    }

    private String getChoice3() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.getChoice3();
    }

    private String getChoice4() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.getChoice4();
    }

    private String getErwtisi() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.getErwtisi();
    }

    private int getNumberCode() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.getNumberCode();
    }

    private java.util.List<java.lang.Object> randomErwtisi() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        return port.randomErwtisi();
    }

    private void themataRandom(java.lang.String arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.StartThemata port = service_3.getStartThemataPort();
        port.themataRandom(arg0);
    }

   

    
}
