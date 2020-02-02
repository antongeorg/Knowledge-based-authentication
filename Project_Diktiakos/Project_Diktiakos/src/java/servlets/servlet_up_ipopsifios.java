/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;


import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import com.oreilly.servlet.MultipartRequest;
import java.util.Enumeration;
import javax.servlet.annotation.MultipartConfig;
import javax.xml.ws.WebServiceRef;
import static jdk.nashorn.internal.objects.NativeError.getFileName;
import loginwebservices.UpIpopsifiosWs_Service;


@MultipartConfig
public class servlet_up_ipopsifios extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/up_ipopsifios_ws.wsdl")
    private UpIpopsifiosWs_Service service;

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
            out.println("<title>Servlet servlet_up_ipopsifios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_up_ipopsifios at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
 
        MultipartRequest m = new MultipartRequest(request, "c:/ipopsifios_themata/");
              Enumeration files = m.getFileNames(); 
                while (files.hasMoreElements()) 
                 { 
                      String name = (String)files.nextElement(); 
                      String filename = m.getFilesystemName(name); 
                      String type = m.getContentType(name); 
                      
                String path1="c:/ipopsifios_themata//"+filename;
                
               upIpopsifios(path1);
                
                if(showCountUpIpopsifios()>=1){
                    out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> ");  
                    out.println("<body background=\"back.jpg\">"); 
                    out.println("Επιτυχημένη εγγραφή");
                    out.println("</body>"); 
                    out.println("<div><a href=epiloges.html>Back</a></div>"); 
                }
                else
                {
                    out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> ");  
                     out.println("<body background=\"back.jpg\">"); 
                    out.println("Αποτυχημένη εγγραφή");
                    out.println("</body>"); 
                    out.println("<div><a href=epiloges.html>Back</a></div>"); 
                }
                     
                 }
       
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private int showCountUpIpopsifios() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.UpIpopsifiosWs port = service.getUpIpopsifiosWsPort();
        return port.showCountUpIpopsifios();
    }

    private void upIpopsifios(java.lang.String arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.UpIpopsifiosWs port = service.getUpIpopsifiosWsPort();
        port.upIpopsifios(arg0);
    }

}
