/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ba.curs.calculadora.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ba.curs.calculadora.calculs.OperationNameLiteral;
import java.lang.annotation.Annotation;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.inject.spi.CDI;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Named;
import com.ba.curs.calculadora.calculs.Operation;

/**
 *
 * @author Sergi
 */
public class CalculadoraServlet extends HttpServlet {

    @Inject
    @Any
    private Instance<Operation> operation;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String resultat = "Error: Operacio desconeguda";
            String resultatPattern = "El resultat de %d %s %d és %d";
            final String operacio = request.getParameter("operacio");
            try {
                int num1 = Integer.parseInt(request.getParameter("num1"));
                int num2 = Integer.parseInt(request.getParameter("num2"));
                Operation op = this.operation.select(new OperationNameLiteral(operacio)).get();
                resultat = String.format(resultatPattern, num1, operacio, num2, op.operacio(num1, num2));

            } catch (NumberFormatException ex) {
                resultat = "Els operants no son correctes";
            }

            out.println(
                    "<!DOCTYPE html>");
            out.println(
                    "<html>");
            out.println(
                    "<head>");
            out.println(
                    "<title>Servlet SpecializedServlet</title>");
            out.println(
                    "</head>");
            out.println(
                    "<body>");
            out.println(
                    "<h1> " + resultat + "</h1>");
            out.println(
                    "</body>");
            out.println(
                    "</html>");

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

}
