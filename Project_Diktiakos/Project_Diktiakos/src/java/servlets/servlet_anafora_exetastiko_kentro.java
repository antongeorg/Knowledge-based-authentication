/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import loginwebservices.AnaforaExetastikouKentro_Service;

/**
 *
 * @author user
 */
public class servlet_anafora_exetastiko_kentro extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Project_Diktiakos/anafora_exetastikou_kentro.wsdl")
    private AnaforaExetastikouKentro_Service service;

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
            out.println("<title>Servlet servlet_anafora_exetastiko_kentro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servlet_anafora_exetastiko_kentro at " + request.getContextPath() + "</h1>");
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
          int par = 0;
        try {
            par = Integer.parseInt(req.getParameter("par1"));
        } catch (NumberFormatException numberFormatException) {resp.sendRedirect("fail1.html");
        } 
            anaforaExetastikoKentro(par);
            out.println("    <style>a:link {\n" +"    text-decoration: none;\n" +"}</style> ");  
            out.println("<body background=\"back.jpg\">"); 
            ArrayList<Integer> list=new ArrayList<Integer>();
              list=(ArrayList<Integer>) getListSum();
              ArrayList<String> list1=new ArrayList<String>();
              list1=(ArrayList<String>) getListName();
              ArrayList<String> list2=new ArrayList<String>();
              list2=(ArrayList<String>) getListLastName();
               for(int i=0; i<list.size(); i++){
                   out.println("<br /><center><font color=\"black\">Ο εξεταζόμενος" +" "+ list1.get(i)+" "+ list2.get(i)+" " +"έχει το εξης αποτέλεσμα"+ " " + list.get(i));
               }
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

    private void anaforaExetastikoKentro(int arg0) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.AnaforaExetastikouKentro port = service.getAnaforaExetastikouKentroPort();
        port.anaforaExetastikoKentro(arg0);
    }

    private java.util.List<java.lang.String> getListLastName() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.AnaforaExetastikouKentro port = service.getAnaforaExetastikouKentroPort();
        return port.getListLastName();
    }

    private java.util.List<java.lang.String> getListName() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.AnaforaExetastikouKentro port = service.getAnaforaExetastikouKentroPort();
        return port.getListName();
    }

    private java.util.List<java.lang.Integer> getListSum() {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        loginwebservices.AnaforaExetastikouKentro port = service.getAnaforaExetastikouKentroPort();
        return port.getListSum();
    }

}
