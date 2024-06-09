package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RespXML extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            out.print("<CATALOGO>");
            out.print("<CD>");
            out.print("<TITULO>Tinta roja</TITULO>");
            out.print("<ARTISTA>Andres Calamaro</ARTISTA>");
            out.print("<ORIGEN>AR</ORIGEN>");
            out.print("<PRECIO>5.90</PRECIO>");
            out.print("<YEAR>2006</YEAR>");
            out.print("</CD>");
            out.print("<CD>");
            out.print("<TITULO>La lengua popular</TITULO>");
            out.print("<ARTISTA>Andres Calamaro</ARTISTA>");
            out.print("<ORIGEN>AR</ORIGEN>");
            out.print("<PRECIO>9.90</PRECIO>");
            out.print("<YEAR>2007</YEAR>");
            out.print("</CD>");
            out.print("</CATALOGO>");
        } finally {
            out.close();
        }
    }
}
